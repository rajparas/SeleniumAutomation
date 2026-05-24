package Oops;

abstract class Abs
{
	public abstract void display();
	
	public void star() 
	{
		System.out.println("Hello Java");
	}
}


class AbsImp extends Abs
{
	public void display()
	{
		System.out.println("running Abs Imp.............");
		
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Abs a1 = new Abs(); 
		// For Abstract class, you cannot create a object.
		
		AbsImp ai = new AbsImp();
		ai.display();
		
		ai.star();
		
		
	}

}
