package oops.abstraction;

public class BankDetails {
	
	String name;
	int amt;
	
	public BankDetails(int i) {
		amt = i;
	}
	
	public  int checkBal() {
		return amt;
	}
	
	public void Deposit(int amount) {
		amt = amt + amount;
	}
}
