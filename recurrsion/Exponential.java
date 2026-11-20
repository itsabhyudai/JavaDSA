package recurrsion;
public class Exponential {

	public static void main(String[] args) {
		System.out.println(expnt(2, 10));
	}
	
	public static int expnt(int x, int n) {
		if(x==0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
		if(n==1) {
			return x;
		}
		
//		int  pow = x* expnt(x,n-1); return pow;  // time complexity is O(n) that's why we won't use it
		
		//  here time complexity is log(n)
		
		int  pow = expnt(x, n/2);
		if(n % 2 == 0) {
			return pow * pow;
		}
		else{
			return pow *pow * x;
		}
	}
}
