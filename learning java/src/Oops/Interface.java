package Oops;
interface Lionlnterface {
	  public void eat() ; // interface method
	}

	interface DogInterface {
	  public void voice(); // interface method
	}

	// DemoClass "implements" FirstInterface and SecondInterface
	class cat implements DogInterface, Lionlnterface {
	  public void eat() {
	    System.out.println("leaf");
	  }
	  public void voice() {
	    System.out.println("bhaw bhaw...");
	  }
	}

	class Interface {
	  public static void main(String[] args) {
	    cat c1 = new cat();
	    c1.eat();
	    c1.voice();
	  }
	}
