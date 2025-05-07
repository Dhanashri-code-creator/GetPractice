package day2_04082025;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class OrangeHRM_AnotationDemo {
	
	WebDriver driver;
	
	@BeforeSuite
	
	public void setup()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
		
	}
    @Test
    public void login()
    {
    	driver.findElement(By.name("username")).sendKeys("Admin");
    	driver.findElement(By.name("password")).sendKeys("admin123");
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	
    }
    @Test
    public void verifyHomePage()
    {
    	String dash=driver.findElement(By.xpath("//div[@id='app']/descendant::h6")).getText();
    	if(dash.equals("Dashboard"))
    	{
    		System.out.println("Test case is passed");
    	}
    	else
    	{
    		System.out.println("Test case is Failed");
    	}
    }
    @Test (priority = 3)
    public void logout() throws InterruptedException
    {
    	driver.findElement(By.className("oxd-userdropdown-tab")).click();
    	driver.findElement(By.xpath("//u1[@role='menu']/child::li[4]/child::a")).click();
    	Thread.sleep(50000);
    }
	
}
