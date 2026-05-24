package listener;

import static org.junit.Assert.assertFalse;

import org.testng.annotations.Test;

public class TitleCheck 

{
	@Test	
	public void test1()
	{
		System.out.println("Running Test1...");
	}
	@Test
	public void test2()
	{
		assertFalse(true);
		System.out.println("Running Test2...");
	}

}
