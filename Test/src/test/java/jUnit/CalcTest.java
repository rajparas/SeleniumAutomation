package jUnit;
import static org.junit.Assert.*;
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
		System.out.println(actual);
	}
	
	
	@Test
	public void Test2()
	{
		Calc c = new Calc();
		int actual = c.sub(60, 30);
		int expected = 30;
		assertEquals(expected, actual);
		System.out.println(actual);
	}
	
}

