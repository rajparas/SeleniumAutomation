package amazon;

public class OccuranceOfElement 
{
	static int countOccurrences(int a[], int n, int o) 
    { 
        int rep = 0; 
        for (int i=0; i<n; i++) 
        {
        	if (o == a[i])
        	{
        		 rep++; 
        		
        	}
        }
             
        return rep; 
    } 
	
	public static void main(String[] args) 
	{
		int a[] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 }; 
        int n = a.length; 
        int o = 8; 
        System.out.println(countOccurrences(a, n, o)); 
	}

}
