package loops;
import java.util.*;

public class KejriwalQues {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
// each car is allowed to run on Sunday if the sum of the even digits of the car number is divisible by 4  
		//                               OR the sum of the odd digits of the car number is divisible by 3
		
		System.out.println("enter car number: ");
		int n = sc.nextInt();
		
		int oddSum = 0;
		int evenSum = 0;
		
		while(n!=0) {
			int lastdigit = n%10;
			if(lastdigit % 2 ==0) {
				evenSum = evenSum + lastdigit;
			}
			else {
				oddSum = oddSum + lastdigit;
			}
			n= n/10;
		}
		
		if((evenSum!=0 && evenSum % 4 ==0)||(oddSum!=0 && oddSum % 3 == 0)) {
			System.out.println("can drive on sunday");
		}
		else {
			System.out.println("cannot drive on sunday");
		}
		
		
		sc.close();
	}

}
