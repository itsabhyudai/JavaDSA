package recurrsion;
import java.util.*;
public class GenerateParentheses {
	
	static List<String> list = new ArrayList<>();
	
	public static void main(String[] args) {
		
		int n =2;
		int total =parentheses("",0,0,n);
		System.out.println(list);
		System.out.println("Total number of valid parentheses: "+total);
	}
	
	public static int parentheses(String ans, int o, int c, int n) {
		
		if(o == n && c == n) {
			list.add(ans);
			return 1;
		}
		
		int open = 0; int close = 0;
		
		if(o < n) {
			open = parentheses(ans+"(", o+1, c, n);
		}
		
		if(c < o) {
			close = parentheses(ans+")", o, c+1, n);
		}
		
		return open + close;
	}
}
