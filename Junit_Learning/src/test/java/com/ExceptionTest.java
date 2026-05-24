package com;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest 
{

	@Test(expected = ArithmeticException.class)
	public void test() 
	{
		int i=10;
		int j = i/0;
		
	}
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void test1()
	{
		int a[] = new int[4];
		 a[6] = 10;
	}

}
