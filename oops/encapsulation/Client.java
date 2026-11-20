package oops.encapsulation;

public class Client {
	public static void main(String[] args) {
//		Seller s = new Seller();
//		Seller s1 = new Seller("TV");
		Seller s2 = new Seller("phone", 10000, "patna");
		
		System.out.println("Product: " + s2.product + " Price: " + s2.price + " Location: " + s2.location);
	}
}


// constructor code 
