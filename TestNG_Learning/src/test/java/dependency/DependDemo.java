package dependency;

import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class DependDemo 
 {
	@Test(priority = 1)
	public void registration()
	{	
		assertFalse(true);
		System.out.println("Running Registration Test");
	}
	@Test(priority = 2, dependsOnMethods = "registration")
	public void login()
	{
		System.out.println("Running Login Test");
	}
	
	@Test(priority = 3, dependsOnMethods = "login")
	public void home()
	{
		System.out.println("Running Home Test");
	}
}
