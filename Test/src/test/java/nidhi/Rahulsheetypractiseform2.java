package nidhi;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConn;

public class Rahulsheetypractiseform2 

// This program is for to select multiple items from the list 

{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = DriverConn.getDriver();
		
		int j =0;
		
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot","Brinjal"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
			Thread.sleep(3000);
		
	
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i =0; i<products.size();i++)
		{
			//Brocolli -1Kg
			//Brocolli , 1Kg
			
			String[] name = products.get(i).getText().split("-");
			
			String formattedName = name[0].trim();
			
			//format it to get actual vegetable name
			//convert array into array list for easy search
			//check whether name you extracted is present in array list or not
			
			
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if(itemsNeededList.contains(formattedName))
			{
				j++;
				
				//Click on add to cart 
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j == itemsNeeded.length)
				{
					break;
				}
			}
		}
	}

}
