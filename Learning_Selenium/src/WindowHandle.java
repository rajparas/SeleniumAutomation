
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import util.DriverConn;

public class WindowHandle 
{
	public static void main(String[] args) 
	{
		WebDriver driver = DriverConn.getDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	
		WebElement from = driver.findElement(By.xpath("//ul/li[@id='fourth'][1]"));
		WebElement To = driver.findElement(By.xpath("//ol[@id='amt8']"));
		
		Actions builder = new Actions(driver);
		
	//Action dragndrop =
			builder.click(from).clickAndHold(from).moveToElement(To).release().build().perform();
		
	}
	
}
