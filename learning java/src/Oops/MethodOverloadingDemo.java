package Oops;

class Calc1
{
	public void add(int a, int b)
	{
	int r=a+b;
	System.out.println("Result :"+r);
	
	}
	
	public void add(int a, int b, int c)
	{
		int r = a+b+c;
		System.out.println("Result :"+r);
	}
	
	public void add(int a, double b)
	{
		double r= a+b;
		System.out.println("Result of Sum:"+r);
		
	}
}


public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calc1 c = new Calc1();
		c.add(10, 25);
		
		c.add(10, 20, 30);
		c.add(10, 15);
		c.add(21, 25.55);
		
		
	}

}
