package Tuan3_Bai8;



public class CreditCard {
	
	public Money balance;
	
	public Money creditLimit;
	
	public Person owner;
	
	public CreditCard() {}
	
	public CreditCard(Person newCardHolder, Money limit) {
		this.owner = newCardHolder; 
		this.creditLimit = limit;
		this.balance =new Money(0) ;
		
	}
	
	public Money getBalance() {
		return this.balance;
		
	}
	
	public Money getCreditLimit() {
		return this.creditLimit;
		
	}
	
	public String getPersonals() {
		return owner.toString();
		
	}
	
	public void charge(Money amount) {
		
		Money tempVar = new Money(balance.add(amount));
		if(tempVar.compareTo(creditLimit) > 0) {
			/*this.balance = balance.add(amount);*/
			System.out.println("Exceeds credit limit");
		}else {
			//System.out.println("Charge: "+ tempVar);
			balance = tempVar;
		}
		
	}
	
	public void payment(Money amount) {
		this.balance = balance.subtract(amount);
	}
	
}
