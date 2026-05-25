package nidhi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverConn;

public class Checktitle 
{
	public static void main(String[] args) 
	{
		
		WebDriver driver = DriverConn.getDriver();
		
		driver.get("https://www.topsint.com/topserp/index.php");
		
		WebElement faculty = driver.findElement(By.id("lutype"));
		Select f1= new Select (faculty);
		f1.selectByVisibleText("Faculty");
		
		driver.findElement(By.name("l_username")).sendKeys("Nidhi");
		
		driver.findElement(By.name("l_password")).sendKeys("12345678901");
		
		driver.findElement(By.name("btn_login")).click();
		
		
		String Atitle = driver.getTitle();
		String Etitle = "Welcome to TOPS Management System";
		
		if (Atitle.equals(Etitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		driver.close();
	}

}
