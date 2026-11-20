package backtracking;
import java.util.*;

public class Permutations {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3};
		permut(new ArrayList<>(), arr);
	}
	
	public static void permut(List<Integer> ans, int arr[]) {
		
		if(ans.size() == arr.length) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0; i<arr.length; i++) {
			if(ans.contains(arr[i]) == false) {
				ans.add(arr[i]);
				permut(ans, arr);
				ans.remove(ans.size()-1);
			}
		}	
	}
}
