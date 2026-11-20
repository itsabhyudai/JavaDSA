package strings;

public class OccurenceOfCapitalChar {

	public static void main(String[] args) {
		String s = "Hello Zorld";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); 

            
            if (ch>=65 && ch<=90) {
                count++; 
            }
        }
        System.out.println("Number of capital letters: " + count);
	}
}
