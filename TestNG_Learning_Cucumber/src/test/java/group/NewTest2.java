package group;

import org.testng.annotations.Test;

public class NewTest2 
{
	@Test(groups = "sanity")
	  public void home() 
	  {
		  System.out.println("Running Home test");
	  }
	  
	  @Test
	  public void login() 
	  {
		  System.out.println("Running Login Test");
	  }
	  
	  @Test(groups = "smoke")
	  public void alpha()
	  {
		  System.out.println("Running Alpha Test");
	  }
	  
	 // @Test(priority =2, enabled = false)
	  @Test(groups = "smoke")
	  public void beta()
	  {
		  System.out.println("Running Beta Test");
	  }
}
