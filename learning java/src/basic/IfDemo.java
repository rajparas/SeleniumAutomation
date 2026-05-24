package basic;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 25;
		int c = 20;
		
		if(a>b)
		{
			if (a>c)
			{
				System.out.println("A is greater");
				
			}
			else
			{
				System.out.println("C is greater");
			}
		}
		
		else 
			
			if(b>c)
		{
			System.out.println("B is greater");
			
		}
			else {
				System.out.println("C is greater");
			}
		
		
	}

}
