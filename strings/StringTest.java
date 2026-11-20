package strings;
import java.util.*;
public class StringTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char ch1 = 'A';
		System.out.println((int)ch1);
		System.out.println((char)97);
		
		String s = "Abhi";
		System.out.println(s.charAt(3));
		
		for(int i = 0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == 'a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch+" ");
			}
		}
		
		sc.close();
	}
}
