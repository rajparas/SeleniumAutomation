package Exceptions;

import java.io.FileNotFoundException;

public class CompileTimeExDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  try 
		  { 
			  Class.forName("ExceptionDemo.java");
			  
		  }
		  
		  catch (ClassNotFoundException e)
		  { 
			  e.printStackTrace();  
		  }
		 
		
		
		
			
		
		
		
		
		
	}

}
