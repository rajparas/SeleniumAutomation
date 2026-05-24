package ObjectRepository;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomepageFb 
{
	WebDriver driver;
	public HomepageFb (WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	By Fname = By.name("firstname");
	By Lname = By.name("lastname");
	By Email = By.name("reg_email__");
	By ReenterEmail = By.name("reg_email_confirmation__");
	By Password = By.id("password_step_input");
	By Month = By.name("birthday_month");
	By Day = By.name("birthday_day");
	By Year = By.id("year");
	By Gender = By.name("sex");
	
	public WebElement Fname()
	{
		return driver.findElement(Fname);
	}
	
	public WebElement Lname()
	{
		return driver.findElement(Lname);
	}
	
	public WebElement Email()
	{
		return driver.findElement(Email);
	}
	
	public WebElement ReenterEmail()
	{
		return driver.findElement(ReenterEmail);
	}
	
	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	
	public Select Month()
	{
		 Select month = new Select(driver.findElement(Month));
		return month;	
	}
	
	public Select Day()
	{
		 Select day = new Select(driver.findElement(Day));
		return day;	
	}
	
	public Select Year()
	{
		 Select year = new Select(driver.findElement(Year));
		return year;	
	}
	
	public List<WebElement> Gender()
	{
		 List<WebElement> gender = driver.findElements(Gender);
		 return gender;
	}
	
	
	
}
