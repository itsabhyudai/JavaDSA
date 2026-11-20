package strings;

public class WebsiteQues {

	public static void main(String[] args) {
		
		
		String s = "   hacks.codingblocks.com/app/contest/8283/43";
		s=s.trim();
		String com[] = s.split("/");  // we can't use "." as it is not in regex... so we use "\\." for on the basis of .(dot) 
		for(int i=0; i<com.length; i++) {
			if(i==0) {
				System.out.println("website = "+com[i]);
			}
			else if(i== com.length-2) {
				System.out.println("contest id = "+com[i]);
			}
			else if(i == com.length-1){
				System.out.println("question = "+com[i]);
			}
			
		}
//		System.out.println("website = "+com[0]);
//		System.out.println("contst id = "+com[3]);
//		System.out.println("question = "+com[4]);
	}

}
