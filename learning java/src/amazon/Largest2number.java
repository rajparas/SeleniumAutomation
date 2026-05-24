package amazon;

public class Largest2number 
{
	public static void main (String[] args) 
    {
      int a[] = {1,2,3,4,5,6,7,8,9};
      
      int first, second, a_size = a.length;
 
     
        if (a_size < 2)
        {
            System.out.println("Array size less than two.");
            return;
        }
 
        first = second = Integer.MIN_VALUE;
        for (int i = 0; i < a_size ; i ++)
        {
           
            if (a[i] > first)
            {
                second = first;
                first = a[i];
            }
 
            
            else if (a[i] > second && a[i] != first)
                second = a[i];
        }
        if (second == Integer.MIN_VALUE)
            System.out.println("No second smallest element.");
        else
            System.out.println("The smallest element is " +
                               first + " and second Smallest  element is " + second +".");
    }

}
