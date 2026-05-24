package HybridDriven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class h1Test 
{
WebDriver driver;
	
	
	
	@Test(dataProvider = "dp")
	public void login(String Function, String Keyword,String Locator, String Location, String Data)
	{
		if(Keyword.equals("Browser"))
	    {
			if(Data.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "D:\\Sanket\\Selenium\\Drivers\\chromedriver.exe");
				 driver = new ChromeDriver();
			}
			else if(Data.equals("IE"))
			{
				System.setProperty("webdriver.ie.driver", "D:\\Sanket\\Selenium\\Drivers\\IEDriverServer.exe");
				 driver = new ChromeDriver();
			}
			else if (Data.equals("ff"))
			{
				System.setProperty("webdriver.firefox.marionette", "D:\\Sanket\\Selenium\\Drivers\\geckodriver.exe");
				  driver = new ChromeDriver();
			}
			
			else if(Keyword.equals("Open"))
			{
				driver.get(Data);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
			}
			else if (Keyword.equals("Type"))
			{
				if(Locator.equals("id"))
				{
					driver.findElement(By.id(Location)).sendKeys(Data);
				}
				else if(Locator.equals("name"))
				{
					driver.findElement(By.name(Location)).sendKeys(Data);
				}
			  
			}
			else if(Keyword.equals("Click"))
			{
				if(Locator.equals("Linktext"))
				{
					driver.findElement(By.linkText(Location)).click();
				}
				
				else if(Locator.equals("id"))
				{
					driver.findElement(By.id(Location)).click();
				}
				else if(Locator.equals("name"))
				{
					driver.findElement(By.name(Location)).click();
				}
				else if(Locator.equals("xpath"))
				{
					driver.findElement(By.xpath(Location)).click();
				}
				else if(Locator.equals("cssSelector"))
				{
					driver.findElement(By.cssSelector(Location)).click();
				}
				
			}
			
			else if(Keyword.equals("Select"))
			{
				if(Locator.equals("id"))
				{
					WebElement value = driver.findElement(By.id(Location));
					Select values = new Select(value);
					values.selectByVisibleText(Data);
				}
			}
			
			
			
			else if (Keyword.equals("radio")) {
				if (Locator.equals("name")) 
				{
					List<WebElement> gender = driver.findElements(By.name(Location));
					int val = Integer.parseInt(Data);
					gender.get(val).click();

				}
			}
			 
			 
			 
	    }	
			
			try 
			{
				Thread.sleep(6000);
				 
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }	
			@DataProvider(name ="dp")
			public Object[][] getData()
			{
				h1Reader Exl = new h1Reader();
				int row = Exl.rowCount();
				int col = Exl.colCount();
				Object [][] obj = new Object[row-1][col];
				
				for(int i = 1; i<row; i++)
				{
					for(int j =0; j<col; j++)
					{
						int c= i;
						String data = Exl.getData(i, j);
						obj [i-1][j] = data;
						i=c;
				}
			}
			
				return obj;
			
	}
}


