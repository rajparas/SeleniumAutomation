package ParameterisedTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParaTest 

{
	@Test
	@Parameters({"username", "password"})
	public void login(String username, String password)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Sanket\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://topsint.com/careercenter/index.php");
		driver.findElement(By.name("l_username")).sendKeys(username);
		driver.findElement(By.name("l_password")).sendKeys(password);
		
		driver.findElement(By.name("btn_login")).click();
		
		driver.close();
	}
}
