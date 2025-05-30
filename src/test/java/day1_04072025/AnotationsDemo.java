package day1_04072025;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnotationsDemo {
		
		@BeforeSuite
		public void beforeSuiteMethod()
		{
			System.out.println("Before Suite");
		}
		
		@BeforeTest
		public void beforeTestMethod()
		{
			System.out.println("Before Test");
		}
		
		@BeforeClass
		public void beforeClassMethod()
		{
			System.out.println("Before Class");
		}
		
		@BeforeMethod
		public void beforeMethodMethod()
		{
			System.out.println("Before Method");
		}
		
		@Test
		public void Test1()
		{
			System.out.println("Test1");
		}
		
		@Test
		public void Test2()
		{
			System.out.println("Test2");
		}
		
		
		@AfterMethod
		public void afterMethodMethod1()
		{
			System.out.println("After Method");
		}
		
		@AfterClass
		public void afterClassMethod()
		{
			System.out.println("After Class");
		}
		
		@AfterTest
		public void afterTestMethod()
		{
			System.out.println("After Test");
		}
		
		@AfterSuite
		public void afterSuitetMethod()
		{
			System.out.println("After suite");
		}

	}


