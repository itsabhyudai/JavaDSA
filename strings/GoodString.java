package strings;

public class GoodString {

	public static void main(String[] args) {   //good string is some string in which vowels are more than other character.
		String s = "aEioU##";
		
		int vowel =0;
		int conso = 0;
		
		for(int i=0; i<s.length(); i++ ) {
			char ch = s.charAt(i);
			if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				if(ch == 'a'|| ch == 'e'|| ch == 'i'||ch == 'o'||ch =='u'|| ch == 'A'|| ch == 'E'|| ch == 'I'||ch == 'O'||ch =='U') {
					vowel++;
				}
				else {
					conso++;
				}
			}
		}
		if(vowel>conso) {
			System.out.println("Good String");
		}
		else {
			System.out.println("Not a good string");
		}
	}
}
