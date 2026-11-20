package arrays;
import java.util.*;

public class SumOfElements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		int sum = 0;
		
		System.out.println("enter " + size + " elements: ");
		
		for(int i = 0; i<=size-1; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i = 0; i<=size-1; i++) {
			System.out.print(arr[i] + " ");
			sum = sum + arr[i];
		}
		
		System.out.println();
		System.out.println("sum= " + sum);
		sc.close();
	}

}
