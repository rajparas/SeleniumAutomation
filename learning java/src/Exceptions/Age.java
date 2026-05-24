package Exceptions;

public class Age {

	public void num(int age) throws AgeInvalidException
	
	{
		if (age>=18)
		{
			System.out.println("You are eligle for voting..........");
		}
		
		else
		{
			 throw new AgeInvalidException();
			
		// System.out.println("Invalid Age........");
		}
		
		
		
	}
}
