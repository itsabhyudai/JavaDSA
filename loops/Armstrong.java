package loops;
import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find no. of digits: ");
		int n = sc.nextInt();
		
		int c=0;
		int temp=n;
		
		while(temp!=0) {
			c++;
			temp = temp/10;
			
		}
		
		temp=n;
		int sum=0;
		while(temp!=0) {
			int lastdigit = temp%10;
			sum = sum + (int)Math.pow(lastdigit, c);
			temp=temp/10;
		}
		
		if(n==sum) {
			System.out.println("it is armstrong");
		}
		else {
			System.out.println("not an armstrong number");
		}
		
		System.out.println(c);
		sc.close();
	}

}
