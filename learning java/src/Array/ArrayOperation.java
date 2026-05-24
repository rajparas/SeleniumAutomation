
package Array;

public class ArrayOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[] = {3,7,15,90,75,55,105,25};
		int sum = 0;
		
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];
		}
		
		System.out.println("Sum:"+sum);
		System.out.println("Average:"+ (sum)/a.length);
		
		int max = a[0];
		int min = a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if (a[i]>max)
			{
				max = a[i];
				
			}
			if (a[i]<min)
			{
				min = a[i];
				
			}
		}
		
		System.out.println("Maximum :"+ max);
		System.out.println("Minimum : "+ min);
	}

}
