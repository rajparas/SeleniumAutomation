package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverConn;

public class ParameterStepDefination 
{
	@Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Sanket\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
        
    }
	@And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver = DriverConn.getDriver();
		driver.get("strArg1");
		
    }


   /* @When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
         WebDriver driver = new ChromeDriver();
         driver.findElement(By.id("email")).sendKeys(username);
         driver.findElement(By.id("passContainer")).sendKeys(password);
         driver.findElement(By.name("login")).click();
   
    }

    @Then("^Verify that user is successfully logged in$")
    public void verify_that_user_is_successfully_logged_in() throws Throwable {
    	
    	WebDriver driver = new ChromeDriver();
    	WebElement search = driver.findElement(By.xpath("//*[@id=\"mount_0_0_qp\"]/div[1]/div[1]/div/div[2]/div[2]/div/div/div/div/div/label/input"));
    	if(!search.isDisplayed())
    	{
    		System.out.println("user is not logged in");
    	
    	}
    	else
    	{
    		System.out.println("user is successfully logged in");
    	}
    }
    

    
    
    
    
    
    
    
    

    @Given("Initialize the browser with chrome")
    public void initialize_the_browser_with_chrome() {
    	System.setProperty("webdriver.chrome.driver", "D:\\Sanket\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @Given("Navigate to {string} site")
    public void navigate_to_site(String string) {
    	WebDriver driver = new ChromeDriver();
		driver = DriverConn.getDriver();
		driver.get(string);
    }
    @When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
         WebDriver driver = new ChromeDriver();
         driver.findElement(By.id("email")).sendKeys(username);
         driver.findElement(By.id("passContainer")).sendKeys(password);
         driver.findElement(By.name("login")).click();
    }
    @Then("Verify that user is successfully logged in")
    public void verify_that_user_is_successfully_logged_in() {
    	WebDriver driver = new ChromeDriver();
    	WebElement search = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div/div[1]/ul/li/div/a/div[1]/div[2]/div/div/div/div/span/span"));
    	if(!search.isDisplayed())
    	{
    		System.out.println("user is not logged in");
    	
    	}
    	else
    	{
    		System.out.println("user is successfully logged in");
    	}
    }
*/


}
