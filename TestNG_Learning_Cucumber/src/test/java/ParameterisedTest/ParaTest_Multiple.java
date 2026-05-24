package ParameterisedTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParaTest_Multiple 

{
	WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Sanket\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
	}
	
	
	@Test(dataProvider = "dp")
	public void login(String username, String password)
	{
		WebElement user = driver.findElement(By.id("email"));
		user.clear();
		user.sendKeys(username);
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.clear();
		pass.sendKeys(password);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@DataProvider(name ="dp")
	public Object[][] getData()
	{
		Object [][] obj = new Object[3][2];
		
		obj[0][0]= "tops123@gmail.com";
		obj[0][1]= "tops1234";
		
		obj[1][0]= "tech123@gmail.com";
		obj[1][1]= "tech1234";
		
		obj[2][0]= "abc123@gmail.com";
		obj[2][1]= "abc1234";
		
		return obj;
	}
	@AfterClass
	public void closeBrowser()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}
}
