package basic;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String grade = "A"
				+ "";
		
		switch (grade)
		{
		case "A":
			System.out.println("Excellent");
			break;
			
		case "B": 
			System.out.println("Very Good");
			break;
			
		case "C": 
			System.out.println("Good");
			break;
			
		case"D":
			System.out.println("Not good");
			break;
			
			
		case"E":
			System.out.println("Need Improvement");
			break;
			

		default:
			System.out.println("Enter Valid Choice");
			break;
				
		}
		
		
		
		 
	}

}
