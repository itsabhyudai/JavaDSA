package linkedlist;

public class LinkedListTest {
	
	public class Node{
		int data;
		Node next;    //address is stored in next
		
	}

	private	Node head;
	private	Node tail;
	private	int size = 0;
	
	public void AddFront(int val) {
		Node n = new Node();    // n = new node
		n.data = val;
		n.next = head;    //n's next(address val) = head
		head = n;    // new node (n) will become the new head
		if(size == 0) {
			tail = n;
		}
		size++;
	}
	
	public void AddLast(int val) {
		if(size == 0) {
			Node n = new Node();
			n.data = val;
			head = n;
			tail = n;
			size++;
			return;
		}
		
		Node n = new Node();
		n.data = val;
		tail.next = n;
		tail = n;
		size++;
	}
	
	public void AddAtIndex(int idx, int val) throws Exception {
		if (idx == 0) {
			AddFront(val);
		}
		else if(idx == size) {
			AddLast(val);
		}
		else {
			Node nprev = getNode(idx-1);
			
			Node n = new Node();
			n.data = val;
			
			n.next = nprev.next;
			nprev.next = n;
			size++;
		}
	}
	
	public Node getNode(int idx) throws Exception {
		if(size < idx) {
			throw new Exception ("size is smaller than the required index");
		}
		
		Node current = head;
		for(int i=0; i<idx; i++) {
			current = current.next;
		}
		
		return current;
	}
	
	public int removeFront() throws Exception {
		if(size == 0) {
			throw new Exception("size is 0 so nothing can be removed");
		}	
		
			Node temp = head;
			head = head.next;
			temp.next = null;
			if(size == 1) {
				tail = null;
			}
			size--;
			return temp.data;
	}
	
	public int removeLast() throws Exception {
		if(size == 0) {
			throw new Exception("size is 0 so nothing can be removed");
		}
		else if(size == 1) {
			int data = head.data;
			head = null;
			tail = null;
			size--;
			return data;
		}
		else {
			Node secondLast = getNode(size-2);
			int data = tail.data;
			tail = secondLast;
			secondLast.next = null;
			size--;
			return data;
		}
	}
	
	public int size() {
		return size;
	}
	
	public void Display() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println(".");
	}	
}
