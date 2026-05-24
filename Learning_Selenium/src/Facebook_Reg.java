import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverConn;

public class Facebook_Reg {

	
	static Logger log = (Logger) LogManager.getLogger(Facebook_Reg.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = DriverConn.getDriver();
		log.info("Driver Loaded...");
		
		driver.get("https://www.facebook.com/");
		log.info("URL Opened...");
		
		WebElement account = driver.findElement(By.linkText("Create new account"));
		
		account.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.clear();
		fname.sendKeys("Sanket");
		
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.clear();
		lname.sendKeys("Patel");
		
		WebElement email = driver.findElement(By.name("reg_email__"));
		email.clear();
		email.sendKeys("Sanketpatel5991@gmail.com");
		
		/*WebElement cemail = driver.findElement(By.name("reg_email_confirmation__"));
		cemail.clear();
		cemail.sendKeys("Sanketpatel5991@gmail.com"); */
		
		WebElement pass = driver.findElement(By.name("reg_passwd__"));
		pass.clear();
		pass.sendKeys("Test1234");
		
		
		WebElement day = driver.findElement(By.id("day"));
		Select days = new Select(day);
		days.selectByVisibleText("11");
		
			
		WebElement month = driver.findElement(By.id("month"));
		Select months = new Select(month);
		months.selectByVisibleText("Feb");
		
		
		WebElement year = driver.findElement(By.id("year"));
		Select years = new Select(year);
		years.selectByVisibleText("1994");
		
		List<WebElement> gender = driver.findElements(By.name("sex")); // Radio button was present in Old UI
		gender.get(1).click();
		
		getScreenShot(driver, "D:\\Sanket\\File Demo\\Login.png");
		
		log.info("Operation Completed...");
		
		// driver.close();
		driver.quit();
		
		// To format and align the code : Ctrl+Shift+F
		
		
	}
	
	public static void getScreenShot(WebDriver driver, String path)
	{
		TakesScreenshot snap = (TakesScreenshot) driver;
		File source = snap.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		
		try {
			FileUtils.copyFile(source, dest);
			System.out.println("Screenshot taken");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
