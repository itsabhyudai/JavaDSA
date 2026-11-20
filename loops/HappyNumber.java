package loops;
import java.util.*;

// 19 is a happy number 
// 19: 1² + 9² = 1 + 81 = 82
// 82: 8² + 2² = 64 + 4 = 68
// 68: 6² + 8² = 36 + 64 = 100
// 100: 1² + 0² + 0² = 1 

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int temp = 0;
		
		for(int i = 1; i <= 1000; i++) {
			int sum = 0;
			while(n>0) {
				sum = sum + (n % 10) * (n % 10);
				n = n / 10;
			}
			
			if(sum == 1) {
				temp = 1;
				break;
			}
			
			n = sum;
		}
		
		System.out.println(temp == 1 ? "happy" : "sad");
		
		sc.close();
	}

}
