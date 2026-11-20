package arrays;

public class MinMaxInArray {

	public static void main(String[] args) {
		
		int arr[] = {3,2,3,-1,4,2,55,2,3};
		
		int min =Integer.MAX_VALUE;
		int max =Integer.MIN_VALUE;
		
		for(int i =0; i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
			if(min>arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.println(min + " " + max);
		
	}

}
