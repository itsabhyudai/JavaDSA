package strings;

public class ReverseWords {

	public static void main(String[] args) {
		String s = "Abhi nhi  toh kabhi   nhi  ";
		String[] words = s.trim().split("\\s+");     //using regex
		String result = "";
		
		for(int i=words.length-1; i>=0; i--) {
			result = result + words[i];
			if(i!=0) {
				result = result + " ";
			}
		}
		System.out.println(result);
	}

}
