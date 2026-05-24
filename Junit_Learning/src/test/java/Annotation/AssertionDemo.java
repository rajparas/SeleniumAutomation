package Annotation;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertionDemo 
{
	@Test
	 public void test()
	 {	
		assertEquals(10, 10);
		assertNotEquals(20, 10);
		assertTrue(40>30);
		assertFalse(5>10);
		assertNull(null);
		assertNotNull(10);
		
		int a[] = {10,20,30,40,50,60};
		int b[] = {10,20,30,40,50,60};
		
		assertArrayEquals(a, b);
		
		
		
		 	
	 }
}
