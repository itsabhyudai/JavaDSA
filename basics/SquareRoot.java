package basics;

public class SquareRoot {
	
	public static int sqrt(int x) {
	
		int i = 0;
		int j = x;
		
		while(i<=j) {
			int mid = (i+j)/2;
			
			if(mid*mid == x) {
				return mid;
			}
			
			else if(mid*mid > x) {
				j = mid - 1;
			}
			
			else {
				i = mid + 1;
			}
		}
		return j;
	}
	
	public static void main(String[] args) {
		
		System.out.println(sqrt(8));
	}

}
