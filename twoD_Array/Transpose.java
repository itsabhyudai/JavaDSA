package twoD_Array;

import java.util.Scanner;

public class Transpose {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 2;
		int m = 3;
		int arr[][] = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		print(arr);
		sc.close();
	}
	
	public static void print(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}

}
