package strings;

public class StringBasic {

	public static void main(String[] args) {
		String s ="Harsh is a good boy";
		
		System.out.println(s.charAt(2));
		System.out.println(s.contains("a"));
		System.out.println(s.substring(1,4));
		
		String words[]=s.split(" ");    //Splitting on the basis of space
		for(int i=0; i<words.length; i++) {
			System.out.println(words[i]+"->");
		}
	}

}
