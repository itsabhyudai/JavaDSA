package randomAfterOOPs;

public class Stack {

	protected int arr[];    //changing to protected to use across packages
	
	private int top;
	
	public Stack() {     //constructor
		arr = new int[5];
		top = 0;
	}
	
	public Stack(int n) {
		arr = new int[n];
		top = 0;
	}
	
	public boolean isEmpty() {
		return top == 0;    // if top == 0 return true else return false
	}
	
	public boolean isFull() {
		return top == arr.length;    //if top == arr.length then return true else return false
	}
	
	public void push(int val) throws Exception { 
		if(isFull()) {
			throw new Exception("stack is full");
		}
		
		arr[top] = val;
		top++;
	}
	
	public int pop() throws Exception {
		if(isEmpty()) { 
			throw new Exception("stack is empty");
			
		}
		
		int rv = arr[top-1];
		top--;
		return rv;
		
	}
	
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("stack is empty");
		}
		
		int rv = arr[top-1];
		return rv;
		
	}
	
//	public void display() {        //to avoid zero
//		for(int i=0; i<top; i++) {
//			if(arr[i] != 0) {
//				System.out.print(arr[i]+" ");
//			}
//		}
//	}
	
	public void display() {
	    for(int i = 0; i < top; i++) {
	        System.out.print(arr[i] + " ");
	    }
	    System.out.println();
	}
	
	public int size() {
		return top;
	}
}

