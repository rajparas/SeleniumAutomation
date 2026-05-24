 package com;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
  @Test(priority =1)
  public void home() 
  {
	  System.out.println("Running Home test");
  }
  
  @Test(priority =2)
  public void login() 
  {
	  System.out.println("Running Login Test");
  }
  
  @Test(priority =3)
  public void alpha()
  {
	  System.out.println("Running Alpha Test");
  }
  
 // @Test(priority =4, enabled = false)
  @Test(priority =4)
  public void beta()
  {
	  System.out.println("Running Beta Test");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("Running before every Method");
  }
  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("Running after every Method");
  }
}
