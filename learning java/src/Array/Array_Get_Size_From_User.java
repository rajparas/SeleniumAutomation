package Array;

import java.util.Scanner;

public class Array_Get_Size_From_User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size for Array:");
		
		int size = sc.nextInt();
		
		int a[] = new int[size];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter Value");
			a[i]= sc.nextInt();
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		
		
		
	}

}
