package amazon;

public class MoveZeroOnEnd 
{
	public static void moveZeros(int a[])
	{
		int len = a.length;
		int count =0;
		
		for(int i = 0; i< len; i++)
		{
			if(a[i] != 0)
			{
				a[count++]=a[i];
			}
		}
		
		while(count <len)
		{
			a[count++]=0;
		}
		
		for(int j=0; j<len ; j++)
		{
			System.out.print(a[j] + " ");
		}
	}
	
	public static void main(String[] args) 
	{
		int a[] = {1,3,0,2,0,4,0,0,3,0,5,0};
		moveZeros(a);
		
	}

}

