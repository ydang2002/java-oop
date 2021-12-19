package Lab10;


public class SavingsAccount extends BankAccount {
	double rate = 0.025;
	private int savingNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = getAccountNumber() + " " + savingNumber;
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		savingNumber = oldAccount.savingNumber + 1;
		accountNumber = super.getAccountNumber() + " "+savingNumber;
	}
	
	public void postInterest() {
		double newBalance = getBalance() + getBalance() * rate/12;
	}
	
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}

}
