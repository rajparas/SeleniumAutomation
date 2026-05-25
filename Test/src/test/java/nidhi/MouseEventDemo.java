package nidhi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import util.DriverConn;

public class MouseEventDemo 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new DriverConn().getDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement from = driver.findElement(By.xpath("//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]"));
		
		WebElement to= driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ol[1]/li[1]"));
		
		WebElement f1 = driver.findElement(By.xpath("//body/section[@id='g-container-main']/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]"));
		
		WebElement t1 = driver.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/ol[1]/li[1]"));
		
		Actions builder = new Actions(driver); 
		
		builder.click(from).clickAndHold(from).moveToElement(to).release().build().perform();
		
		Actions b1 = new Actions(driver);
		
		b1.click(f1).clickAndHold(f1).dragAndDrop(f1, t1).build().perform();
		
		WebElement m = driver.findElement(By.name("field-keywords"));
		
	 
	}

}
