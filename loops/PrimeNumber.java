package loops;
import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number: ");
		int n = sc.nextInt();
		int p = 0;
		
		if( n == 0 || n == 1) {
			p=1;
		}
		
		for(int i=2; i<n-1; i++) {
			if(n%i==0) {
				p=1;
			}
		}
		if(p==0) {
			System.out.println("it is a prime number");
		}
		else {
			System.out.println("it is not a prime number");
		}
		
		sc.close();
	}

}
