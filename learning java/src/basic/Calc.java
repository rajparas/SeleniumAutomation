package basic;

import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no1 : ");
		int a = sc.nextInt() ;
		
		System.out.println("Enter no2 : ");
		int b = sc.nextInt() ;
		
		
		System.out.println("Enter choice");
		System.out.println("1 : Add");
		System.out.println("2 : Sub");
		System.out.println("3 : Mul");
		System.out.println("4 : Div");
		
		int choice = sc.nextInt();
	
		if(choice==1)
		{
			int c = a+b;
			System.out.println("Addition is : "+c);
		}
		else if(choice==2)
		{
			int c = a-b;
			System.out.println("Substraction is : "+c);
		}
		else if(choice==3)
		{
			int c = a*b;
			System.out.println("Multiplication is : "+c);
		}
		else if(choice==4)
		{
			int c = a/b;
			System.out.println("Division is : "+c);
		}		
		else
		{
			System.out.println("Invalid Choice");
		}
		
		
	}		
}