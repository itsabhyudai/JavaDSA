package oops.polymorphism;

public class PolyExample {

	public static void main(String[] args) {
		
		int sum = sum(2,3);
		double sum1 = sum(2.5, 4.5);
		int sum2 = sum(2,3,4);
		
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(sum2);
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	
	public static double sum(double a, double b) {      // method overloading
		return a+b;
	}
	
	public static int sum(int a, int b, int c) {
		return a+b+c;
	}
}
