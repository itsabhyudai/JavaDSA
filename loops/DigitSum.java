package loops;
import java.util.*;

public class DigitSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find no. of digits: ");
		int n = sc.nextInt();
		
		int sum = 0; 
		int count = 0;
		while(n!=0) {
			
			int lastdigit = n%10;
			sum = sum + lastdigit;
			
			n = n/10;
			count++;
		}
		System.out.println("No. of digits= " + count); 
		System.out.println("Sum of digits= " + sum);
		
		sc.close();
	}

}

