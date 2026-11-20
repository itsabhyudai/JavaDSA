package arrays;

public class ArrayExist {

	public static void main(String[] args) {
		
		int arr[] = {1,0,6,-1,3,2,-5};
		
		boolean found = Search(arr,3);
		System.out.println(found);
		
	}
		
	public static boolean Search(int arr[], int target) {
		for(int i=0; i<arr.length; i++) {
			if(target == arr[i]) {
				 System.out.println("true");
			}
			else {
				System.out.println("false");
			}
		}
		return false;
	}
		
//		for(int i =0; i<arr.length; i++) {
//			int e = 0;
//			if(e==arr[i]) {
//				System.out.println("element exist");
//			}
//		}
//		
		
		

}
