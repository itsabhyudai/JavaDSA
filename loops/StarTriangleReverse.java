package loops;
import java.util.*;

public class StarTriangleReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter no. of row: ");
		int row = sc.nextInt();
		
		for(int i=row; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

} 
