package arrays;

public class IndexOfPeakElement {     //index of biggest element in the array
	
	public static void main(String[] args) {
		
		int[] arr = {1,3,7,6,6,6,6,4,3,2,1};
        int peakIndex = peakIndex(arr);
        System.out.println("Index of peak element: " + peakIndex);
        System.out.println("Peak element: " + arr[peakIndex]);
	}
	
	public static int peakIndex(int[] arr) {
		
		int i = 0;
		int j = arr.length-1;
		
		while(i<j) {
			int mid = (j-i)/2 +i;
			
			if (arr[mid] > arr[mid + 1]) {
                j = mid;
            } 
			
			else {
                i = mid + 1;
            }
		}
		return i;
	}
	
}


/* 		int[] arr = {0,10,5,2};
		
		int peakIndex = 0;
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i] > arr[peakIndex]) {
				peakIndex = i;
			}
		}
		System.out.println("Index of peak element: " + peakIndex);
        System.out.println("Peak element: " + arr[peakIndex]); */