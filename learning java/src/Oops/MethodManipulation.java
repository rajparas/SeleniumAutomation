package Oops;

class Calc 
{

public void add(int a, int b)
{
	int r = a+b;
	System.out.println("Sum :"+r);
}


public int mul(int a, int b)
{
	int r = a*b;
	return r;
	
}

public void arrayadd(int a[])
{
	int sum = 0;
	for(int i=0;i<a.length;i++)
	{
		sum = sum +a[i];
		
	}
	System.out.println("Sum of Array : "+sum);
}

public void addNum(int...a)
{
	for (int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	
}
	
}



public class MethodManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc c = new Calc();
		c.add(10, 20);
		
		int b= c.mul(20, 30);
		System.out.println("Mul :"+b);
		System.out.println(c.mul(30, 40));
		
		
		int a[] = {10,20,30,40,50,60,70};
		c.arrayadd(a);
		
		
		c.addNum(10,20,30,40,50,60,70,80);
			
		
	}

}
