package merge_sort;

public class QuickSort {

	public static void main(String[] args) {
		
		int arr[] = {6,9,1,5,3,11,3,4};
		
		sort(0, arr.length-1, arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static void sort(int start_idx, int end_idx, int[] arr) {
		
		if(start_idx > end_idx) {
			return;
		}
		
		int pivot_idx = find(start_idx, end_idx, arr);
		
		sort(start_idx, pivot_idx-1, arr);    //first half
		sort(pivot_idx+1, end_idx, arr);      // second half
		
	}
	
	public static int find(int start_idx, int end_idx, int arr[]) {
		int item = arr[end_idx];
		int pivot_idx = start_idx;
		
		for(int i=start_idx; i<end_idx; i++) {
			if(item>arr[i]) {
				int temp = arr[pivot_idx];
				arr[pivot_idx] = arr[i];
				arr[i] = temp;
				pivot_idx++;
			}
		}
		
		int temp = arr[pivot_idx];
		arr[pivot_idx] = item;
		arr[end_idx] = temp;
		
		return pivot_idx;
	}
}
