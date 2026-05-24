import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import util.DriverConn;

public class FramesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = DriverConn.getDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		WebElement frameName = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		System.out.println("Number of frames: "+driver.findElements(By.tagName("iframe")).size());
		// driver.switchTo().frame(0);
		driver.switchTo().frame(frameName);
		
		WebElement from = driver.findElement(By.xpath("//div[@id='draggable']/p"));
		WebElement to = driver.findElement(By.xpath("//div[@id='droppable']/p"));
		
		Actions builder = new Actions(driver);
		Action dragAndDrop = builder.dragAndDrop(from, to).build();
		dragAndDrop.perform();
		
		driver.switchTo().defaultContent();
		
		driver.quit();
		System.out.println("Program Ended...");
	}

}
