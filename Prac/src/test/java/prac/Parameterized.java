package prac;

import java.nio.file.attribute.AclEntry;
import java.util.concurrent.TimeUnit;

import javax.sound.sampled.TargetDataLine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import org.testng.annotations.Test;

import util.DriverConn;

public class Parameterized
{

	WebDriver driver;
	private String username;
	private String password;
	
	
	@BeforeClass
	public void init()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Sanket\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");
		
	}
	
	
	@Test(dataProvider = "dp")
	
	public void login(String username , String password)
	{
		this.username = username;
		this.password = password;
		
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
	}
	
	@DataProvider(name= "dp")
	public Object[][] getdata()
	{
		Object obj[][] = new Object[2][2];
		
		obj[0][0] = "abc@gmail.com";
		obj[0][1] = "abc123";
		
		obj[1][0] = "xyz@gmail.com";
		obj[1][1] = "xyz123";
		
	
		return obj;
	}
	
	
}
