package functions;

public class Test {

	public static void main(String[] args) {
		fun1();
		sum(1,2);
		sum(2,3,4);
		System.out.println(sq(7));
		System.out.println(sq(10));
		
	}
	
	public static void fun1() {    //non parameterized function
		System.out.println("hello funny");
	}
	
	public static void sum(int a, int b) {    //parameterized function
		System.out.println(a+b);
	}
	
	public static void sum(int a, int b, int c) {    //function overloading (method overloading)
		System.out.println(a+b+c);
	}
	
	public static int sq(int a) {
		return a*a;
	}
	
	
}
