package PracticeJunit;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class PracCalcTest 
{
	@Test
	public void getAdd()
	{
		Calc c = new Calc();
		int actual = c.add(25, 75);
		int expected = 100;
		assertEquals(expected, actual);
	}
	
	@Ignore
	@Test
	public void getMul()
	{
		Calc c = new Calc();
		int actual = c.mul(25, 2);
		int expected = 50;
		assertEquals(expected, actual);
	}
	
	@Test
	public void getSub()
	{
		Calc c = new Calc();
		int actual = c.sub(25, 15);
		int expected = 10;
		assertEquals(expected, actual);
	}
	
	
	
}
