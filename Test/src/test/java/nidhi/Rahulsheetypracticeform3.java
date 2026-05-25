package nidhi;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import util.DriverConn;

public class Rahulsheetypracticeform3 
{
	public static void main(String[] args) 
	{
		WebDriver driver = DriverConn.getDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("Nidhi Savani");
		
		driver.findElement(By.name("email")).sendKeys("nidhisavani5698@gmail.com");
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("12345");
		
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement sex = driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select s1 = new Select(sex);
		
		s1.selectByVisibleText("Female");
		
		List<WebElement> emp = driver.findElements(By.id("inlineRadio1"));
		emp.get(0).click();
		
		driver.findElement(By.name("bday")).sendKeys("07/09/1994");
		
		driver.findElement(By.xpath("/html/body/app-root/form-comp/div/form/input")).click();
		
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		
	}

}
