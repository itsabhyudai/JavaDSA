package loops;
import java.util.*;

public class AbundantNumber {

	//
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number: ");
		int n = sc.nextInt();
		
		System.out.println("factors= ");
		int sum = 0;
		for (int i = 1; i <=n/2; i++) {  // here we can do "i<n" or "i<=n-1" also but loop will take more time
			                            //  same as perfect number 
			if(n%i==0) {
				
				System.out.println(i);
				sum = sum +i;
			}
			
		}
		
		System.out.println("sum of factors= "+ sum);
		
		if(sum == n) {
			System.out.println("neutral number");
		} else if(sum > n) {
			System.out.println("abundant number");
		}else {
			System.out.println("deficiet number");
		}
		
		sc.close();
	}

}
