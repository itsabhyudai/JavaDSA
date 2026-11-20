package randomAfterOOPs;

public class StackClient {

	public static void main(String[] args) throws Exception {
		
		Stack s = new Stack(5);
		
		s.push(1);
		s.push(0);
		s.push(3);
		s.push(4);
		
		System.out.println(s.pop());
		System.out.println(s.size());
		
		s.display();
		System.out.println();
	}
}
