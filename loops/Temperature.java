package loops;

public class Temperature {

	public static void main(String[] args) {
		//celcius to fahrenheit from 20 to 100  only even
		
		for(int i=20; i <=100; i+=2) {
			int f = (int) ((i * 1.8) + 32);
			System.out.println(i + " celcius = " + f + " fahrenheit");
		}
	

	}

}
