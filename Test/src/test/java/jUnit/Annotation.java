package jUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Annotation
{
	@Before
	public  void method1()
	{
		System.out.println("Running @before, before each the test cases");
	}
	
	@After
	public  void method2()
	{
		System.out.println("Running @after, after each the test cases");
	}
	
	@AfterClass
	public static void method3()
	{
		System.out.println("Running @afterClass, after all the test cases");
	}
	
	@BeforeClass
	public static void method4()
	{
		System.out.println("Running @beforeClass, before all the test cases");
	}
	
	@Test
	public  void method5()
	{
		
	assertEquals(5,5);
	
			System.out.println("Both are not equal");
		
		
	
	}
	


}
