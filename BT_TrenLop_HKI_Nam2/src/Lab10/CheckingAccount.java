package Lab10;

public class CheckingAccount extends BankAccount {
	private static double fee = 0.15;
	
	
	public CheckingAccount(String owner, double amount) 
	{

	    super(owner, amount);

	    setAccountNumber(getAccountNumber() + "-10");

	}
	
	
	@Override
	public boolean withdraw(double amount ) {
		amount = amount + fee;
		return super.withdraw(amount);
	}


}
