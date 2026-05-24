package com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest1
{	
	@Test	
	public void payment()
	{
		System.out.println("Running Payment Test");
	}
	
	@Test
	public void order()
	{
		System.out.println("Running Order Test ");
	}
	@Test
	public void cart()
	{
		System.out.println("Running Cart Test");
	}
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Running before every Test");
	}
	@AfterTest
	public void afterTest()
	{
		System.out.println("Running after every Test");
	}
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Running before every class");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("Runnning after every class");
	}
	@BeforeSuite
	public void beforeSuite() 
	{
		System.out.println("Running before Suite");
	}
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Running after Suite");
	}
}
