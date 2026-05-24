package basic;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 90-100 - First Class
		// 70-89 - Second Class
		// 40-69 - Third Class
		// 1-39 - Fail 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		
		String name = sc.next();
		
		System.out.println("Enter your marks");
		
		int marks = sc.nextInt();
		
		if ( marks>=90 && marks<=100)
		{
			System.out.println("First Class");
			
		}
		
		else if(marks>=70 && marks<=89)
		{
			System.out.println("Second Class");
		}
		
		else if(marks>=40 && marks<=69)
		{
			System.out.println("Third Class");
		}
		
		else if(marks>=1 && marks<=39)
		{
			System.out.println("Fail");
		}
		
		else
		{
			System.out.println("Invalid Input");	
		}
	}

}
