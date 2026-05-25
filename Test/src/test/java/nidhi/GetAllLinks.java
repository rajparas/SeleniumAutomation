package nidhi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import util.DriverConn;

public class GetAllLinks 
{
	public static void main(String[] args) 
	{
		WebDriver driver = DriverConn.getDriver();
		driver.get("https://www.amazon.com/");
		
		List<WebElement>links = driver.findElements(By.tagName("a"));
		System.out.println("Total links :" +links.size());
		
		String [] str = new String [links.size()];
		int count=0;
		
		for(WebElement l : links)
		{
			str[count] = l.getText();
			count++;
		}
		
		for(String s :str)
		{
			if(!s.equals(""))
			{
				
				System.out.println("Links :" +s);
			}
			
			
		}
		
		
	
	}

}
