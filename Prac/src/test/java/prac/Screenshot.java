package prac;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

import util.DriverConn;

public class Screenshot
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = DriverConn.getDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.id("travel_from")).sendKeys("Newark Liberty International Airport (EWR) Newark");
		
		driver.findElement(By.xpath("//button[contains(text(),'SEARCH')]")).click();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D:\\New folder\\screenshot.png"));
	}

}
