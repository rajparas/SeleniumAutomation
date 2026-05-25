package nidhi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import util.DriverConn;

public class KeybordDemo 
{
	public static void main(String[] args) 
	{
		WebDriver driver = DriverConn.getDriver();
		
		driver.get("https://www.google.com/imghp?hl=en&tab=ri&ogbl");
		WebElement search = driver.findElement(By.name("q"));
		
		Actions b1 = new Actions(driver);
		
		Action s = b1.click(search)
				
				.sendKeys(search,"fli")
		
			
				.sendKeys(Keys.ENTER)
				.build();
		s.perform();
	
		
				
		
	}

}
