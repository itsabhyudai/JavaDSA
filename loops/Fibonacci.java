package loops;
public class Fibonacci {
	public static void main(String[] args) {
		int n=10, first=0, second=1, c=0;
		
		while(c<n) {
			System.out.print(first + " ");
			
			int next = first + second;
			first = second;
			second = next;
			c++;
		}
	}
}
