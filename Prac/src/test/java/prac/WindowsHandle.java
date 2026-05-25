package prac;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.DriverConn;

public class WindowsHandle 
{
	public static void main(String[] args) {
		
		WebDriver driver =DriverConn.getDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		driver.findElement(By.linkText("Click Here")).click();
		
		Set <String>windows =driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		String mainWin = it.next();
		String ChildWin = it.next();
	
		driver.switchTo().window(ChildWin);
		
		System.out.println(driver.findElement(By.cssSelector(".example")).getText());
		
		driver.switchTo().window(mainWin);
		
		System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		driver.quit();
		
	}

}

