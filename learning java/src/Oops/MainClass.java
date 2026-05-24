package Oops;

class Pen {
	static int price = 10;
	String color = "Blue";
	String company = "Cello";

	public void star() {
		System.out.println(price + " " + color + " " + company);
	}
	
	public static void display()
	{
		System.out.println("Running display............");
	}

}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program Started****");

		Pen p = new Pen();
		Pen.price=80;
	
		// p.price = 50;
		p.color = "Red";
		p.star();
		
		Pen.display();

		
		Pen p1 = new Pen();
		p1.star();
	}

}
