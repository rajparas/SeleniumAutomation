package Oops;

class P
{
	public void run()
	{
		System.out.println("Running P Class Run Method..........");
	}
}

class Q extends P
{
	public void run()
	{
		System.out.println("Running Q Class Run Method..........");
		
		super.run();
	}
	
}


public class MethodOveridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Q q = new Q();
		q.run();

	}

}
