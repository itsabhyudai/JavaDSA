package loops;
import java.util.*;

public class Factors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find factor: ");
		int n = sc.nextInt();
		
		System.out.println("Factors of " + n + " are:");
		
		int fact =2;
		while(n>1) {
			if(n%fact == 0) {
				System.out.println(fact);
				n=n/fact;
			}
			else {
				fact++;
			}
		}
		sc.close();
	}

}
