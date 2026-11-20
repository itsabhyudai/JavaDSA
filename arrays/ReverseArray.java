package arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		int arr[] = {5,4,3,2,1};
		
			rev(arr);	
			for(int i =0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
		
		}
	
		public static void rev(int arr[]) {
			int end =arr.length-1;
			for(int start =0; start<end; start++, end--) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}	
				
				/*start = 0;
				end = arr.length-1;
				while(start<end) {
					int temp = arr[start];
					arr[start] = arr[end];
					arr[end] = temp;
					start++;
					end--;
				}*/
					
	}
}
