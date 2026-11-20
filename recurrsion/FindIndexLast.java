package recurrsion;

public class FindIndexLast {

	public static void main(String[] args) {
		
			
			int arr[] = {1,2,3,4,6,7,8,6,5};
			int target = 6;
			
			System.out.println(find(arr,arr.length-1,target));   //change here
		}
		
		public static int find(int arr[], int idx, int target) {
			
			if(idx>=arr.length) {
				return -1;
			}
			
			if(arr[idx]==target) {
				return idx;
			}
			
			int f = find(arr, idx-1, target);   //change here
			return f;
		}
}
