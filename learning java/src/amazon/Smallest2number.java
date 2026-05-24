package amazon;

import java.util.Arrays;

public class Smallest2number 
{
	
	 public static void main (String[] args) 
	    {
	      int a[] = {1,2,3,4,5,6,7,8,9};
	      
	      int first, second;
	 
	     
	        if (a.length < 2)
	        {
	            System.out.println("Array size less than two.");
	            return;
	        }
	 
	        first = second = Integer.MAX_VALUE;
	        for (int i = 0; i < a.length ; i ++)
	        {
	           
	            if (a[i] < first)
	            {
	                second = first;
	                first = a[i];
	            }
	 
	            
	            else if (a[i] < second && a[i] != first)
	                second = a[i];
	        }
	        if (second == Integer.MAX_VALUE)
	        {
	            System.out.println("No second smallest element.");
	        }
	        else
	        {
	            System.out.println("The smallest element is " +
	                               first + " and second Smallest  element is " + second +".");
	        }
	    }
	}


