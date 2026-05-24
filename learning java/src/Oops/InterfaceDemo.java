package Oops;
interface Intr1
{
	public void run();
}

interface Intr2
{
	
}

class Interexe implements Intr1, Intr2
{
	
	@Override
	public void run() 
	{
		System.out.println("Running Run method...........");
		
	}
	
}


public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Interexe ex = new Interexe();
		ex.run();
		
		
	}

}
