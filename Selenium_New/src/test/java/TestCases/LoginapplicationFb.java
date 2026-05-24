package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import ObjectRepository.FacebookLoginpage;
import ObjectRepository.HomepageFb;
import util.DriverConn;

public class LoginapplicationFb {

	public static void main(String[] args) {
		
		
		WebDriver driver = DriverConn.getDriver();
		 
		 /* 
		  driver.get("https://www.facebook.com/");
		  FacebookLoginpage fb = new FacebookLoginpage(driver);
		  fb.UserID().sendKeys("rajparasanket2@gmail.com");
		  fb.Password().sendKeys("Test1234"); 
		  fb.Login().click();
		*/
		  
		driver.navigate().to("https://www.facebook.com/");
		// driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		
		HomepageFb home = new HomepageFb(driver);
		home.Fname().sendKeys("Sanket");
		home.Lname().sendKeys("Rajpara");
		home.Email().sendKeys("Test1234@gmail.com");
	//	home.ReenterEmail().sendKeys("Test1234@gmail.com");
		home.Password().sendKeys("Test1234");
		home.Month().selectByVisibleText("Feb");
		home.Day().selectByVisibleText("11");
		home.Year().selectByVisibleText("1994");
		home.Gender().get(0).click();
		
	}

}
