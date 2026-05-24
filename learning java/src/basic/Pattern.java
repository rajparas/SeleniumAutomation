package basic;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//row		
		for(int j=1;j<=7;j++)
		{
			//column
			for(int i=1;i<=10;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("Task Completed...");
		
		// Program 2
		
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("Task Completed...");
		
		// Program 3
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
