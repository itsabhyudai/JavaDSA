package oops.abstraction;

public class BankClient {

	public static void main(String[] args) {
		
		BankDetails user = new BankDetails(8);
		
		user.name = "abhi";
		
		System.out.println(user.checkBal());
		user.Deposit(12);
		System.out.println(user.checkBal());
	}

}
