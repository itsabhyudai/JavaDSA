package loops;
import java.util.*;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find factor: ");
		int n = sc.nextInt();
		
		//System.out.println("Factors of " + n + " are:");
		int sum=0;
		int fact =2;
		while(n>1) {
			if(n%fact == 0) {
				//System.out.println(fact);
				n=n/fact;
				sum = sum + fact;
			}
			
			
			//--------------NOT WORKING--------------------------
			
			else {
				fact++;
			}
		}
		if (sum + 1 == n) {
			System.out.println("it is a perfect number");
		}
		else {
			System.out.println("it is not a perfect number");
		}
		
		
		sc.close();
	}

}
