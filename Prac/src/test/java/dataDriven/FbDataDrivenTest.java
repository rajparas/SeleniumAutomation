package dataDriven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class FbDataDrivenTest

{
	WebDriver driver;
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Sanket\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.linkText("Create new account")).click();
		
	}
	
	
	@Test(dataProvider = "dp")
	public void login(String fname, String lname,String email,String cemail,String password, String mm, String Date,String Year,String gender)
	{
		System.out.println(fname+" "+lname+" "+email+" "+cemail+" "+password+" "+mm+" "+Date+" "+Year);
		
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.clear();
		firstname.sendKeys(fname);
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.clear();
		lastname.sendKeys(lname);
		
		WebElement emailadd = driver.findElement(By.name("reg_email__"));
		emailadd.clear();
		emailadd.sendKeys(email);
		
		/* WebElement cemailadd = driver.findElement(By.name("reg_email_confirmation__"));
		cemailadd.clear();
		cemailadd.sendKeys(cemail); */
		 
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		pass.clear();
		pass.sendKeys(password);
		
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		Select months = new Select(month);
		months.selectByVisibleText(mm);
		
		
		WebElement day = driver.findElement(By.id("day")); 
		Select days = new Select(day); 
		days.selectByVisibleText(Date);
		 
		
		WebElement year = driver.findElement(By.name("birthday_year")); 
		Select years= new Select(year); 
		years.selectByVisibleText(Year);
		 
		
		List<WebElement> gender1 = driver.findElements(By.name("sex"));
		int val = Integer.parseInt(gender);
		gender1.get(val).click();
		 
		  
		try {
			Thread.sleep(5000);
			 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	@DataProvider(name ="dp")
	public Object[][] getData()
	{
		
		
		FbExcelReader exl = new FbExcelReader();
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
	
	@AfterClass
	public void closeBrowser()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}
}
