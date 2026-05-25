package General;
import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import util.DriverConn;

public class SauceLabsTest {
		public static final String USERNAME = "oauth-sanketpatel5989-7c47c";
	    public static final String ACCESS_KEY = "60fdc0d2-fa24-424c-b312-6d34255b16b5";
	    public static final String URL = "https://oauth-sanketpatel5989-7c47c:60fdc0d2-fa24-424c-b312-6d34255b16b5@ondemand.us-west-1.saucelabs.com:443/wd/hub";

	
	public static void main(String[] args) throws MalformedURLException 
	{
		// TODO Auto-generated method stub
		
		
		  DesiredCapabilities caps = DesiredCapabilities.chrome();
		  caps.setCapability("platform", "Windows 7");
		  caps.setCapability("version", "75");
		  
		  WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps);
		 
		  
		  driver.get("https://www.google.com/");
		  System.out.println(driver.getTitle());
		  
		  System.out.println("Operation Completed...");
		  
	}

}
