package nidhi;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import util.DriverConn;

public class Reg_form
{
	public static void main(String[] args) 
	{
		WebDriver driver = DriverConn.getDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.id("firstName")).sendKeys("Nidhi");
		driver.findElement(By.id("lastName")).sendKeys("Rajpara");
		driver.findElement(By.id("userEmail")).sendKeys("Rajpara123@gmail.com");
		
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		
		driver.findElement(By.id("userNumber")).sendKeys("1234567890");
		
		driver.findElement(By.id("dateOfBirthInput")).clear();
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'June')]")).click();
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]")).click();
		driver.findElement(By.xpath("//option[contains(text(),'1994')]")).click();
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[5]")).click();
		
		/*WebElement subject = driver.findElement(By.id("subjectsContainer"));
		Actions builder = new Actions(driver);
		Action subject1 = builder.click(subject).sendKeys("H").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
		subject1.perform();
		*/
		 driver.findElement(By.xpath("//label[contains(text(),'Music')]")).click();
		
		WebElement photo = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		photo.sendKeys("C:\\Users\\rajpa\\Desktop\\NMS38242.JPG");
		
		driver.findElement(By.id("currentAddress")).sendKeys("USA");
		
		WebElement s = driver.findElement(By.id("state"));
		Actions builder = new Actions(driver);
		Action s1 = builder.click(s).sendKeys("Har").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
		s1.perform();
		
		WebElement c = driver.findElement(By.id("city"));
		Actions builder1 = new Actions(driver);
		Action c1 = builder1.click(c).sendKeys("Pan").sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build();
		c1.perform();

	
		}
	
		
		
		
		
		
		
	}


