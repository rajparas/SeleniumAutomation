package nidhi;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fb 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Sanket\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Nidhi");
		
		driver.findElement(By.name("lastname")).sendKeys("Rajpara");
		
		driver.findElement(By.name("reg_email__")).sendKeys("nidhirajpara5698@gmail.com");
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("nidhirajpara5698@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"password_step_input\"]")).sendKeys("2015982721");
		
		WebElement m = driver.findElement(By.id("month"));
		Select m1 = new Select(m);
		m1.selectByVisibleText("Jul");
		
		WebElement d = driver.findElement(By.id("day"));
		Select d1 = new Select(d);
		d1.selectByVisibleText("9");
		
		WebElement y = driver.findElement(By.id("year"));
		Select y1 = new Select(y);
		y1.selectByVisibleText("1994");
		
		
		List<WebElement> gender = driver.findElements(By.name("sex"));
		gender.get(0).click();
		
		
		
		
		
		
		
	}

}
