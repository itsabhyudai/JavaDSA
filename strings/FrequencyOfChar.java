package strings;
public class FrequencyOfChar {

	public static void main(String[] args) {
		String s = "aabbbccccddddda";
		
		int i=0; 
		while(i<s.length()) {
			int j=i;
			while(j<s.length() && s.charAt(i) == s.charAt(j)) {
				j++;
			}
			System.out.println(s.charAt(i)+" "+(j-i)+" ");
			i=j;
		}
	}
}
