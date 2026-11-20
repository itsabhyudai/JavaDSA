package strings;


public class LongestPalindromeSubstring {

	public static void main(String[] args) {
		String ans = "";
		String s = "babad";
		for(int i=0; i<s.length(); i++) {
			for(int j=i; j<s.length(); j++) {
				
				String str = (s.substring(i,j+1));
				
				if(Pal(str) == true && ans.length()<str.length()) {
					ans = str;
				}
			}
		}

	}
	public static boolean Pal(String str) {
		int i=0;
		int j= str.length()-1;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				return false;
				
			}
			i++;
			j--;
			
		}
		System.out.println(str);
		return false;
	}
	
}
