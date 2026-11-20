package twoD_Array;

public class JaggedArray {

	public static void main(String[] args) {
		
		int arr[][] = new int [4][];
		arr[0] = new int [5];
		arr[1] = new int [4];
		arr[2] = new int [2];
		arr[3] = new int [6];
		
		arr[3][4] = 1;
		//arr[2][3] = 0;      //wrong hai....index of of bounds

	}

}
