package nidhi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.DriverConn;

public class AlertBox
{
	public static void main(String[] args)
	{
		WebDriver driver = new DriverConn().getDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.name("cusid")).sendKeys("1234");
		
		driver.findElement(By.name("submit")).click();
		
		String s = driver.switchTo().alert().getText();
		System.out.println(s);
		
		driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		
		
	}

}
