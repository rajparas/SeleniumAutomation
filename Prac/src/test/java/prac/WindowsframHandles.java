package prac;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.internal.thread.ThreadExecutionException;

import util.DriverConn;



public class WindowsframHandles 
{
	public static void main(String[] args) throws ThreadExecutionException
	{
		WebDriver driver = DriverConn.getDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set <String>windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		String ParentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		
		String emailId =driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		driver.switchTo().window(ParentId);
		
		driver.findElement(By.id("username")).sendKeys(emailId);
	}

}
