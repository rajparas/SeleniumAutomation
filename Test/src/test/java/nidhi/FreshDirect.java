package nidhi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.DriverConn;

public class FreshDirect
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = DriverConn.getDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Women")).click();
		
		driver.findElement(By.linkText("View All")).click();
		
	}

}
