package amazon;

public class Smallnumber 
{
	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6,7};
		
		int first, second ;
		
		if(a.length < 2)
		{
			System.out.println("Array size is less than two");
			return;
		}
		
		first = second = Integer.MAX_VALUE;
		for(int i = 0; i< a.length; i++)
		{
			if(a[i] < first)
			{
				second = first;
				first = a[i];
			}
			
			else if (a[i] < second && a[i] != first)
			
				second = a[i];
			
		}
			
			if(second == Integer.MAX_VALUE)
			{
				System.out.println("There is no second smallest");
			}
			else
			{
	
				System.out.println("First smallest number is :" +first + "And second smallest number is :" +second);
			}
		}
		
	}





