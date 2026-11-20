package loops;
import java.util.*;

//Boston number => sum of the digits = sum of the digits of factors (i.e, if factors are 12, 3, 4 then sum = 1+2+3+4) 

public class BostonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		int temp = n;
		int fact =2;
		int factSum = 0;
		
		while(temp>1) {
			if(temp%fact==0) {
				int tempfact = fact;
				
				while(tempfact>0) {
					int lastdigit = (tempfact%10);
					factSum= factSum + lastdigit;
					tempfact = tempfact / 10;
				}
				temp = temp/fact;
			}
			else {
				fact++;
			}
		}
		temp = n;
		int digitsum =0;
		
		while(temp>0) {
			int lastdigit = temp % 10;
			digitsum = digitsum + lastdigit;
			temp /= 10;
		}
		
		System.out.println(digitsum == factSum?"boston":"not boston");
		
		sc.close();
	}

}
