package com;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class CalcTest 

{

	@Test
	public void addTest()
	{
		Calc c = new Calc();
		int actual = c.add(10, 20);
		int expected = 30;
		assertEquals(expected, actual);	
	}
	
	
	@Test
	public void mulTest()
	{
		Calc c = new Calc();
		int actual = c.mul(30, 5);
		int expected = 150;
		assertEquals(expected, actual);	
	}
	
	@Test
	public void subTest()
	{
		Calc c = new Calc();
		int actual = c.sub(25, 5);
		int expected = 20;
		assertEquals(expected, actual);	
	}
	
	
	
	
}
