package arrays;

public class KadanesAlgo {    //Optimized solution for MaxSumOfSubArray

	public static void main(String[] args) {
		int arr[] = {3,5,-9,-2,1,4,5,6};
		
		int max = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
			if(sum > max) {
				max = sum;
				
			}
			if (sum < 0) {
				sum = 0;
			}
		}
		System.out.println(max);
	}
	
}
