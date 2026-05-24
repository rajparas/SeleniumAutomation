package Oops;

public class Employee {

	private int id;
	private String name;

	public void setData(int id, String name) {

		this.id = id;
		this.name = name;

		System.out.println(id + " " + name);

	}
	// The code you provided mainly demonstrates Encapsulation.
	// The class Employee has private data members: id and name.
	// Access to these variables is controlled through a public method setData().
	// This hides the internal details (variables) and exposes only controlled access through methods.

}
