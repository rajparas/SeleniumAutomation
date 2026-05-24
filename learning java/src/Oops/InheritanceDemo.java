package Oops;

class Animals
{
	int legs = 4;
	int eyes = 2;
	
	
	public void eat()
	{
		System.out.println("Animal Eating.................");
	}
	
}

class Dog extends Animals
{
@Override
public void eat() 
{
	System.out.println("Dog Eating................");
}
	
}



public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();
		d.eat();
		
		d.legs=5;
		d.eyes=2;
	
		d.eat();
		
	
	}

}
