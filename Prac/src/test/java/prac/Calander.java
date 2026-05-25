package prac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.DriverConn;

public class Calander 
{
	public static void main(String[] args) 
	{
		WebDriver driver = DriverConn.getDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.id("travel_date")).click();
		
		// Code for select month from the calander (universal code)
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May 2023"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		// Code for select date from the calander (universal code)
		

	/*	while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("2023"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}  */
		
		
		// Code for select date from the calander (universal code)
		
		
		
		List<WebElement>dates = driver.findElements(By.className("day"));
		
		int count = driver.findElements(By.className("day")).size();
		
		for(int i=0 ; i<count ; i++)
		{
			String text = driver.findElements(By.className("day")).get(i).getText();
			
			if(text.equals("21"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
	}

}
