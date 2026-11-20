package arrays;
import java.util.*;

public class ArrayBasic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size of array: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("enter " + size + " elements: ");
		
		for(int i = 0; i<=size-1; i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i = 0; i<=size-1; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}

}
