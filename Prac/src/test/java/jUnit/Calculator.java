package jUnit;

import static org.testng.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



@RunWith (Parameterized.class)
public class Calculator 
{
	int num1;
	int num2;
	int exp;
	
	public Calculator (int num1 , int num2, int exp)
	{
		this.num1 = num1;
		this.num2 = num2;
		this.exp = exp;
	}
	
	@Test
	public void test ()
	{
		Calculator1 C = new Calculator1();
		int actual = C.add(num1, num2);
		int expected = exp;
		
		assertEquals(expected, actual);
	}
	
	@Parameters
	public  static List<Object[]> dataprovider()
	{
		Object obj[][] = new Object[4][3];
		
		obj [0][0] = 20;
		obj [0][1] =40;
		obj [0][2] = 60;
		
		obj [1][0] = 50;
		obj [1][1] =50;
		obj [1][2] = 100;
		
		obj [2][0] = 70;
		obj [2][1] =40;
		obj [2][2] = 110;
		
		obj [3][0] = 60;
		obj [3][1] =20;
		obj [3][2] = 80;
		
		
		
		return Arrays .asList(obj);
		
	}
}
