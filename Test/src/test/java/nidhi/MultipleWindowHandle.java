package nidhi;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.DriverConn;

public class MultipleWindowHandle 
{
	public static void main(String[] args)
	{
		WebDriver driver = new DriverConn().getDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		
		String MainWin = driver.getWindowHandle();
		System.out.println("MainWindow : "+MainWin);
		
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> wins = driver.getWindowHandles();
		System.out.println("Afterclick window: "+wins);
		for (String s : wins)
		{
			if (!s.equals(MainWin))
			{
				driver.switchTo().window(s);
				driver.findElement(By.name("emailid")).sendKeys("123@gmail.com");
				
				driver.findElement(By.name("btnLogin")).click();
			}
		}
		
	
	}

}
