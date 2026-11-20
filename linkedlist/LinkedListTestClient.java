package linkedlist;

public class LinkedListTestClient {

	public static void main(String[] args) throws Exception {
		
		LinkedListTest ll = new LinkedListTest();
		
		ll.AddFront(5);
		ll.AddFront(6);
		ll.AddFront(7);
		ll.AddFront(2);
		
		ll.AddLast(-1);
		
		ll.Display();
		
		ll.removeFront();
		ll.Display();
		
	}
}
