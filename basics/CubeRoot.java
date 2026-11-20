package basics;

public class CubeRoot {

	public static int cbrt(int x) {
		
		int i = 0;
		int j = x;
		
		while(i<=j) {
			int mid = (j-i)/2 +i;
			
			if(mid*mid*mid == x) {
				return mid;
			}
			
			else if(mid*mid*mid > x) {
				j = mid - 1;
			}
			
			else {
				i = mid + 1;
			}
		}
		return j;
	}
	
	public static void main(String[] args) {
		
		System.out.println(cbrt(1000));
		
	}

}
