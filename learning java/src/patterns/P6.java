package patterns;

public class P6 {

	public static void main(String[] args) 
	{
		int lines=9;
		int starcount=1;
		int spacecount =lines-1;
		int mid= (lines/2)+1;
		int i,j,k;
		
			for(j=1; j<=lines; j++)
		{
			for(k=1; k<=spacecount; k++)
			{
				System.out.print(" ");
			}
		
		for(i=1;i<=starcount ;i++)
		{
			System.out.print("*");
		}
		 System.out.println();
		
		if(j < mid)
		{
			starcount=starcount+2;
			spacecount--;
		}
		else
		{
			starcount=starcount-2;
			spacecount++;
		}
	}

}
}


