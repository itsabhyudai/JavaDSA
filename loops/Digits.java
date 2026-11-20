package loops;
import java.util.*;

public class Digits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to find no. of digits: ");
		int n = sc.nextInt();
		
		int c=0;
		while(n!=0) {
			n = n/10;
			c++;
		}
		System.out.println(c);
		sc.close();
	}

}
