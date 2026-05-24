package amazon;

import java.util.Arrays;

public class Mearge2Array
{
	public static void merge(int x[] , int y[], int m, int n) // function to merge  x[],y[] into x[]
	{
		int k = m + n + 1; // size of x[] is k+1
		
		while(m >=0 &&  n >=0) //run x[] or y[] has elements left
		{
			
			if(x[m] > y[n]) // put the next greater element in the next free position in x[]
			{
				x[k--] = x[m--];  // from the end
			}
			else
			{
				x[k--] = y[n--];
			}
		}
		
		
		while (n >=0)  // copy the remaining elements of `Y[]` (if any) to `X[]`
		{
			x[k--] = y[n--];
		}
		
		Arrays.fill(y, 0); // fill `Y[]` with all zeroes
	}
	
	
	// The function moves non-empty elements in `X[]` in the
    // beginning and then merge them with `Y[]`
	public static void arrange (int x[], int y[])
	{
		if (x.length == 0) // return if `X` is empty
		{
			return;
		}
		
		
		 // moves non-empty elements of `X[]` at the beginning
		int k = 0;  
		for (int value : x)
		{
			if (value != 0)
			{
				x[k++] = value;
			}
			
		}
		
		merge(x, y, k -1, y.length -1);
		
	}


	public static void main(String[] args) 
	{
		Mearge2Array arrays = new Mearge2Array();
		
		
		int x[] = { 2, 3, 5, 6, 0, 0, 0};
		int y[]= { 1, 8, 9 };
		arrange(x, y);
		
		System.out.println(Arrays.toString(x));
		
	}

}
