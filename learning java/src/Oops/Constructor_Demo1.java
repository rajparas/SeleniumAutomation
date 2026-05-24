package Oops;

class Demo
{
static int count = 0;

	 Demo()
	{
		System.out.println("Demo Calling.........");
		count++;
		System.out.println("Count :"+count);
	}
	
}


public class Constructor_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		Demo d3 = new Demo();
		
		
	}

}
