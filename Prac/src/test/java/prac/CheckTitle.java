package prac;

import org.openqa.selenium.WebDriver;

import util.DriverConn;

public class CheckTitle
{
	public static void main(String[] args)
	{
		WebDriver driver = DriverConn.getDriver();
		
		driver.get("https://www.topsint.com/topserp/index.php");
		
		String ActualTitle = driver.getTitle();
		String ExceptedTitle = "Welcome to TOPS Management System";
		
		if(ActualTitle.equals(ExceptedTitle))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
