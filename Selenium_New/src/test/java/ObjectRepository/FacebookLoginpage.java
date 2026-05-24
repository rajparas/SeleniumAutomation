package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookLoginpage

{
	WebDriver driver;
	public FacebookLoginpage(WebDriver driver)
	{
		 this.driver = driver;
	}
	
	By username = By.xpath("//*[@id=\"email\"]");
	By password = By.id("pass");
	By loginbutton = By.name("login");
	
	
	public WebElement UserID()
	{
		return driver.findElement(username);
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement Login()
	{
		return driver.findElement(loginbutton);
	}

}
