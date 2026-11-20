package randomAfterOOPs;

public class ExceptionThrow {

	public static void main(String[] args) throws Exception {
		int age = 14;
		if(age<18) {
			throw new Exception("can't drive");
		}
		else {
			System.out.println("can drive");
		}
	}
}
