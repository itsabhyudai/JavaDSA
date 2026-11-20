package merge_sort;

public class PivotIndex {

	public static void main(String[] args) {
		
		int arr[] = {7,5,1,3,9,4};
		
		int pivot_idx = find(0, arr.length-1, arr);
		System.out.println(pivot_idx);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
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
