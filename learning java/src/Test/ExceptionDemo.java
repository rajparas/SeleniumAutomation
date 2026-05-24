package Test;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.out.println("Program Started...");
		
		
		
		
		try 
		
		{
			/*int i=0;
			int j= 10/i;*/
			
			int a[]= new int[5];
			
			a[7]= 25;
			
			
			
		}
		
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Program Ended...");
		
		
	}

}
