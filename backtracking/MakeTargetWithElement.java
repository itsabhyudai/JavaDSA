package backtracking;
import java.util.*;
public class MakeTargetWithElement {

	public static void main(String[] args) {
		int elements[] = {2,3,5};
		
		//make_target("", 8, elements, 0);
		
		make_target(new ArrayList<>(), 8, elements, 0);
		
	}
	
	//public static void make_target(String ans, int target, int elements[], int i) {
	
	public static void make_target(List<Integer> ans, int target, int elements[], int i) {
	
		if(target == 0) {
			System.out.println(ans);
			return;
		}
		
		while(i<elements.length) {
			
			if(target>=elements[i]) {
				
				ans.add(elements[i]);
				make_target(ans, target-elements[i], elements, i);
				ans.remove(ans.size()-1);
			}
			
			i++;
		}
		
//		for(i=i; i<elements.length; i++) {
//			if(target>=elements[i]) {
//				make_target(ans+elements[i], target-elements[i], elements, i);
//			}
//		}
	}
}
