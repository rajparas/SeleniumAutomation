package Exceptions;

public class BankOperation {
	
	double balance;
	public void getBalance()
	{
		System.out.println("Your Current Balance is : "+balance);
	}
	
	
	public void deposit(double amt)
	{
		balance = balance+amt;
		
	}
	
	public void withdraw(double amt) throws InsufficientFundException
	{
		if (amt>balance)
		{
			throw new InsufficientFundException();
		}
		else
		{
			balance = balance-amt;
		}
		
	}
	
}
