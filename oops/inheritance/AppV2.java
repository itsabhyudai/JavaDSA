package oops.inheritance;

public class AppV2 extends AppV1{

	public void videoCall() {
		System.out.println("video call feature!");
	}
	
	public void story() {
		System.out.println("strory feature available!");
	}
	
	@Override
	public void seen() {     // method overriding
		System.out.println("updated seen feature!");
	}
	
}
