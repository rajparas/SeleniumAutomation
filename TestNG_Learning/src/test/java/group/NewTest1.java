package group;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1
{	
	@Test(groups ="sanity")
	public void payment()
	{
		System.out.println("Running Payment Test");
	}
	
	@Test
	public void order()
	{
		System.out.println("Running Order Test");
	}
	@Test(groups = {"smoke","sanity"})
	public void cart()
	{
		System.out.println("Running Cart Test");
	}
	}
