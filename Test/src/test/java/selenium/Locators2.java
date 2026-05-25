package selenium;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
	String name = "Nidhi";
	System.setProperty("webdriver.chrome.driver", "D:\\Sanket\\Selenium\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	String password = getpassword(driver);
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	
	
	driver.findElement(By.id("inputUsername")).sendKeys(name);
	driver.findElement(By.name("inputPassword")).sendKeys(password);
	driver.findElement(By.className("signInBtn")).click();
	
	Thread.sleep(2000);
	
	System.out.println(driver.findElement(By.cssSelector("p")).getText());
	Assert.assertEquals(driver.findElement(By.cssSelector("p")).getText(), "You are successfully logged in.");
	
	Assert.assertEquals(driver.findElement(By.xpath("//h2")).getText(), "Hello " +name+",");
	
	driver.findElement(By.xpath("//button[@class='logout-btn']")).click();
	
	driver.close();
	
	
	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); 
		String pwdText = (driver.findElement(By.cssSelector("form p")).getText());
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = pwdText.split("'");
		// String[] passwordArray2 = passwordArray[1].split("'");

		// passwordArray2[0]
		String password = passwordArray[1].split("'")[0];
		return password;
		
		//0th index - Please use temporary password

		//1st index - rahulshettyacademy' to Login.


		//0th index - rahulshettyacademy

		//1st index - to Login.
		
	}
	

}
