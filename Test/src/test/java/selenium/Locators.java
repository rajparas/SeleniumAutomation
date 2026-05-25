package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Sanket\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("Nidhi");
		driver.findElement(By.name("inputPassword")).sendKeys("nidhi8600");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Nidhi"); // Custom XPath by tagname and attribute value
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sanket2@gmail.com");//Custom Css by tagname and attribute value
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear(); //Custom XPath by tagname and attribute value and index number
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("rajparasanket2@gmail.com"); // Custom css by tagname,attribute value and index number
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("2015982721"); // Custom XPath by travarse from parent to child and index number
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click(); // Custom Css by classname
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div/button[@class='go-to-login-btn']")).click();// Custom XPath by traverse from parent to child
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rajparasanket2@gmail.com");// Custom Css by attribute's value
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");// Custom Css by regular Expression
		driver.findElement(By.xpath("//input[contains(@name,'chkboxOne')]")).click(); // Custom Xpath by regular Expression
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();// Custom Xpath by regular Expression
		
		driver.close();
	}

}
