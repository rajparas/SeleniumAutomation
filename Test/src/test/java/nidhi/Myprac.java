package nidhi;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConn;

public class Myprac 
{
	
	// This program is for to add particular item in to the cart
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = DriverConn.getDriver();
		
	//	int j=0;
		
	//	String[] itemsNeeded= {"Tomato","Potato","Capsicum","Beans"}; 
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		Thread.sleep(5000);
		
	
		List<WebElement>products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i =0; i<products.size();i++)
		{
			String[] name = products.get(i).getText().split("-");
			
			String Newname = name[0].trim();
			
		 //   List itemsNeededList = Arrays.asList(itemsNeeded);
			
			if(Newname.equals("Tomato"))
			{
				
			//	j++;
			    driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
			    
			   // if(j == itemsNeeded.length)
			   // {
			    	break;
			   // }
			}
		}
		
	}

}
