package arraylist;
import java.util.*;
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList<>();
		
		//add
		list.add(5);
		list.add(4);
		list.add(8);
		System.out.println(list);

		//contains
		System.out.println(list.contains(4));
		
		//get
		System.out.println(list.get(2));
		
		//remove
		System.out.println(list.remove(0));
		System.out.println(list);
		
		//adding by index
		list.add(1,10);
		System.out.println(list);
		
		//size
		System.out.println(list.size());
		
		//sort
		Collections.sort(list);
		System.out.println(list);
		
		//binary search
		System.out.println(Collections.binarySearch(list, 10));  //2
		System.out.println(Collections.binarySearch(list, 9));   //-3 (if 9 would have been there it should be 3rd element)
		
	}

}
