package recurrsion;

public class PathFindCount {       //same as PathFind program 

	public static void main(String[] args) {
		
		int n = 3;
		int m = 3;
		
		int cc = 0;    //current column
		int cr = 0;    //current row
		
		int dc = m-1;    //destination column
		int dr = n-1;    //destination row
		
		int total =path("", cc, cr, dc, dr);     //stored value in total
		System.out.println("Total number of possible paths: "+total);
		
	}
	
	public static int path(String ans, int cc, int cr, int dc, int dr) {     //changed void to int
		
		if(cc == dc && cr == dr) {
			System.out.println(ans);
			return 1;    //returning integer value
		}
		
		if(cc > dc  || cr > dr) {
			return 0;    //returning integer value
		}
		
		//horizontal
		int h =path(ans+"H", cc+1, cr, dc, dr);     //storing in a variable
		
		//vertical
		int v =path(ans+"V", cc, cr+1, dc, dr);	    //storing in a variable
		
		return h+v;     //returning added values
	}
}
