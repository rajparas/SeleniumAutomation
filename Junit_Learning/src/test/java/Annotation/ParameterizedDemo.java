package Annotation;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.Calc;

@RunWith(Parameterized.class)
public class ParameterizedDemo 
{
	int n1;
	int n2;
	int result;
	
	

	public ParameterizedDemo(int n1, int n2, int result) {
		super();
		this.n1 = n1;
		this.n2 = n2;
		this.result = result;
	}

	@Test
	public void addTest()
	{
		Calc c = new Calc();
		
		assertEquals(result, c.add(n1, n2));
		
		
	}
	
	@Parameters
	public static List<Object[]> getData()
	{
		Object obj[][]	= new Object[4][3];
		
		obj[0][0] = 10;
		obj[0][1] =	20;
		obj[0][2]= 30;
		
		obj[1][0] = 20;
		obj[1][1] =	20;
		obj[1][2]= 40;
		
		obj[2][0] = 40;
		obj[2][1] =	30;
		obj[2][2]= 70;

		obj[3][0] = 50;
		obj[3][1] =	50;
		obj[3][2]= 100;
		
		return Arrays.asList(obj);
		

	}

}
