package Exceptions;

public class AgeOpr {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		
		Age a = new Age();
		
		
		try {
			a.num(16);
		} catch (AgeInvalidException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Program Ended............");
		
	}

}
