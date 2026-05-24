package patterns;

public class P7 
{
	public static void main(String[] args) 
	{
		int lines=5;
		int i,j,starcount=1;
		
		for(j=1; j<=lines; j++)
		{
			for(i=1; i<=starcount; i++)
			{
				if((j%2==0) && (i%2==0) || (i%2!=0) && (j%2!=0))
				{
					System.out.print("1");
				}
					else
					{
						System.out.print("0");
					}
			}
				System.out.println("");
				starcount++;
		}
	}
}
		

