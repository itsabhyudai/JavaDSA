package randomAfterOOPs;

public class ReverseQueue {
	
	public static void Rev(Queue q) throws Exception{
		if(q.isEmpty()) return;
		int x =q.Dequeue();
		Rev(q);
		q.Enqueu(x);
	}
}
