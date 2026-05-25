package jUnit;
import java.sql.Time;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Parameterized.class)
public class LoginTest1 
{

	String username;
	String password;
	static WebDriver driver;

	public LoginTest1 (String username , String password)
	{
		this.username= username;
		this.password = password;

	}
	
	@BeforeClass
	public static void openbrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Sanket\\Selenium\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	}
	@Before
	public void clear() throws InterruptedException
	{
		driver.findElement(By.name("email")).clear();;
		driver.findElement(By.id("pass")).clear();;
		
	Thread.sleep(5000);
	}
	
	@Test
	public void login()
	{
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		/*driver.findElement(By.name("login")).click(); */
		
		

	}
	
	@Parameters
	public static List<Object[]>dataprovider()
	{
		Object obj[][] = new Object [4][2];
		
		obj [0][0] = "abc@gmail.com";
		obj [0][1] = "abc123";
		
		obj [1][0] = "xyz@gmail.com";
		obj [1][1] = "xyz123";
		
		obj [2][0] = "pqr@gmail.com";
		obj [2][1] = "pqr123";
		
		obj [3][0] = "mno@gmail.com";
		obj [3][1] = "mno123";
		
		return Arrays.asList(obj);
	}
}
