package FailScreenshot;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class TitleCheck 

{
	@Test
	public void titleCheck(ITestContext i)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Sanket\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		i.setAttribute("currentdriver", driver);
		i.setAttribute("imgname", "TitleCheck");
		
		assertEquals(driver.getTitle(), "fb");
		
		driver.quit(); 
		
		
	}
	
	@Test
	public void login(ITestContext i)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Sanket\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		i.setAttribute("currentdriver", driver);
		i.setAttribute("imgname", "Login");
		
		driver.findElement(By.id("email")).sendKeys("tops123@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tech123");
		driver.findElement(By.name("login")).click();
		assertEquals(driver.getTitle(), "fb");
		
		driver.quit(); 
		
		
	}

}
