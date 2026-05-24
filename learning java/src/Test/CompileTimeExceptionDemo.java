package Test;

public class CompileTimeExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			Class.forName("ExceptionDemo.java");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
