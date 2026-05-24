package Annotation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.DriverConn;

public class MercuryTours 
{
	static WebDriver driver;
	
	@BeforeClass
	public static void openBrowser()
	{
		driver = DriverConn.getDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
	}
	
	
	@AfterClass
	public static void closeBrowser()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}
	
	@Before
	public void checkhome()
	{
		driver.findElement(By.linkText("Home")).click();
		if(driver.getTitle().equals("Welcome: Mercury Tours"))
		{
			System.out.println("You are on Homepage...");
		}
	}
	@After
	public void home()
	{
		driver.findElement(By.linkText("Home")).click();
		System.out.println("Home :"+driver.getTitle());
	}
	
	
	
	@Test
	public void hotels()
	{
		driver.findElement(By.linkText("Hotels")).click();
		System.out.println("Hotels :"+driver.getTitle());
	}
	
	@Test
	public void flights()
	{
		driver.findElement(By.linkText("Flights")).click();
		System.out.println("Flights :"+driver.getTitle());
	}
}
