package loops;
import java.util.*;

public class HCF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter first number: ");
		int n = sc.nextInt();
		System.out.println("enter second number: ");
		int m = sc.nextInt();
		
		int hcf =1;
		
		for(int i=2; i<=Math.min(n, m); i++) {
			if(n%i==0 && m%i==0) {
				hcf=i;
			}
		}
		
		System.out.println("HCF = " + hcf);
		
		sc.close();
	}

}
