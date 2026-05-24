package Test;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		BankOperation op = new BankOperation();
		op.getBalance();
		
		op.deposit(8000);
		op.getBalance();
		
		
		try {
			op.withdraw(10000);
		} catch (InsufficientFundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		op.getBalance();
	}

}
