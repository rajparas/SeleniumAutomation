package jUnit;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import util.DriverConn;

public class NewtourWeb 
{
	static WebDriver driver;
	
	@BeforeClass
	public static void openbrowser()
	{
		driver = DriverConn.getDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
	}

	@AfterClass
	public static void closeBrowser()
	{
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}
		@Before
		public void home()
		{
			driver.findElement(By.linkText("Home")).click();
			System.out.println("Home :"+driver.getTitle());
		}
		
		@Test
		public void flight()
		{
			driver.findElement(By.linkText("Flights")).click();
			System.out.println("Flight Page Title : " +driver.getTitle());
		}
		
		@Test
		public void Hotels()
		{
			driver.findElement(By.linkText("Hotels")).click();
			System.out.println("Hotels Page Title : " +driver.getTitle());
		}
}
