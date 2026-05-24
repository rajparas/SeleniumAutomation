package HybridDriven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class HybridTest 

{
	WebDriver driver;
	
	
	@Test(dataProvider = "dp")
	public void login(String Function, String Keyword, String Locator, String Location, String Data)
	{
		if(Keyword.equals("Browser"))
		{
			if(Data.equals("chrome"))
			{
				 System.setProperty("webdriver.chrome.driver", "D:\\Sanket\\Selenium\\Drivers\\chromedriver.exe");
				 driver = new ChromeDriver();
			}
			
			else if(Data.equals("ff"))
			{
				System.setProperty("webdriver.firefox.marionette", "D:\\Sanket\\Selenium\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
			else if(Data.equals("ie"))
			{
				System.setProperty("webdriver.ie.driver", "D:\\Sanket\\Selenium\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			
		}
		
		else if(Keyword.equals("open"))
		{
			driver.get(Data);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			// driver.findElement(By.linkText("Create New Account")).click();;
			
		}
		else if(Keyword.equals("Type"))
		{
			if(Locator.equals("name"))
			{
				driver.findElement(By.name(Location)).sendKeys(Data);
			}
			
			else if(Locator.equals("id"))
			{
				driver.findElement(By.id(Location)).sendKeys(Data);
			}
			else if(Locator.equals("xpath"))
			{
				driver.findElement(By.xpath(Location)).sendKeys(Data);
			}
			else if(Locator.equals("cssSelector"))
			{
				driver.findElement(By.cssSelector(Location)).sendKeys(Data);
			}
		}
		
		else if(Keyword.equals("Click"))
		{
			if(Locator.equals("Linktext"))
			{
				driver.findElement(By.linkText(Location)).click();
			}
			else if(Locator.equals("name"))
			{
				driver.findElement(By.name(Location)).click();
			}
			else if(Locator.equals("id"))
			{
				driver.findElement(By.id(Location)).click();
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
		 
		 

		try {
			Thread.sleep(5000);
			 
		} catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@DataProvider(name ="dp")
	public Object[][] getData()
	{
		
		
		HybridReader exl = new HybridReader();
		int row = exl.rowcount();
		int col= exl.colcount();
		
		Object [][] obj = new Object[row-1][col];
		
		
		for (int i=1;i<row;i++)
		{
			for (int j=0;j<col;j++)
			{
				int c=i;
				String data = exl.getData(i, j);
				obj[i-1][j]= data;
				i=c;
				

			}
		}
		
		
		return obj;
	}
	
}
