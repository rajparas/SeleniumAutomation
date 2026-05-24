package Oops;

class A {
	public void display() {

		int a = 10;

		System.out.println("Running Display Method.............");
	}

}

class B extends A

{
	int a = 50;

	public void eat(int a) {
//	System.out.println("Super A"+super.a);

		System.out.println("This A :" + this.a);
		System.out.println("A : " + a);
		System.out.println("Running Eat Method.............");

	}

}

class C extends B {
	int a = 75;

	public void sample() {
		System.out.println("A :" + a);
		System.out.println("Super A :" + super.a);

		System.out.println("Running Sample Method.............");
	}

}

public class InheritanceDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B b = new B();
		b.eat(100);

		C c = new C();
		c.sample();

	}

}
