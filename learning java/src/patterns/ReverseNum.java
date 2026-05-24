package patterns;

public class ReverseNum 
{
	public static void main(String[] args)
	{
		int i , n , temp, sum=0;
		
		n=252021;
		temp = n;
		
		while (n>0)
		{
			int r = n%10;
			sum= sum*10+r;
			n=n/10;
		}
		System.out.println("Reverse number is: " +sum);
		
		
	}

}
