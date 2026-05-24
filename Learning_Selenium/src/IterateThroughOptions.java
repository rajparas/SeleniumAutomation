import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConn;

public class IterateThroughOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = DriverConn.getDriver();
	
		
		driver.get("https://www.facebook.com/");
		
		
		WebElement account = driver.findElement(By.linkText("Create new account"));
		
		account.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		
		String [] testData = {"test1", "test2", "test3"};
		
		for(String s : testData) {
			WebElement fname = driver.findElement(By.name("firstname"));
			fname.clear();
			fname.sendKeys(s);
			
		}
		
	}

}
