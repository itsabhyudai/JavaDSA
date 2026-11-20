package recurrsion;

public class FindIndexRecurssion {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,6,7,8,6,5};
		int target = 6;
		
		System.out.println(find(arr,0,target));
	}
	
	public static int find(int arr[], int idx, int target) {
		
		if(idx>=arr.length) {
			return -1;
		}
		
		if(arr[idx]==target) {
			return idx;
		}
		
		int f = find(arr, idx+1, target);
		return f;
	}

}
