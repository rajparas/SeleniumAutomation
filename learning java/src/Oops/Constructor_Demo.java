package Oops;

class Student {

	int id;
	String name;
	
	
	Student(String name)
	{
		System.out.println("Called by:"+name);
		
	}
	
	Student()
	{
		System.out.println("Demo Zero-Parameter");
	}
	
	Student(int a, String b)
	{
		id=a;
		name=b;
		
	}
	
	public void display()
	{
		System.out.println(id+" "+name);
		
	}
}

public class Constructor_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st = new Student(10,"Tops");
		st.display();
		
		Student st1 = new Student(20, "Tops");
		st1.display();
		
		Student st2 = new Student("Java");
		st2.display();
		
		Student st3 = new Student();
		
	}

}
