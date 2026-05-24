package Annotation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FirstDemo 

{
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Running before Program...");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("Running after Program...");
	}
	
	@Before
	public void beforeTest()
	{
		System.out.println("Running before every test...");
	}
	@After
	public void afterTest()
	{
		System.out.println("Running after every test...");
	}
	

	@Test
	public void alpha()
	{
		System.out.println("Running Alpha Method...");
	}
	
	@Test
	public void beta()
	{
		System.out.println("Running Beta Method...");
	}
	
	
	
}
