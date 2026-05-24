package Oops;

class Animal
{
	public void eat()
	{
		System.out.println("every animal can eat anything");
	}
}
	
class lion extends Animal
{
	public void eat()
	{
		System.out.println("lion eats monkey");
	}
}
public class inheritance
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Animal a1 =new lion();
		
		a1.eat();
		
	}

}
