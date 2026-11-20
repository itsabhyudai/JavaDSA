package strings;
import java.util.*;

public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = sc.nextLine();
		sc.close();
		s = s.toUpperCase();
		int n = s.length();
		int i;
		
		for(i=0; i<n/2;i++) {
			if(s.charAt(i) != s.charAt(n-1-i)) {
				System.out.println(s+ " is not a palindrome!");
				break;
			}
		}
		if (i == n / 2) {
			System.out.println(s+ " is a palindrome!");
	    }
	}
}
