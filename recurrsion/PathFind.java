package recurrsion;

public class PathFind {

	public static void main(String[] args) {
		
		int n = 3;
		int m = 3;
		
		int cc = 0;    //current column
		int cr = 0;    //current row
		
		int dc = m-1;    //destination column
		int dr = n-1;    //destination row
		
		path("", cc, cr, dc, dr);
	}
	
	public static void path(String ans, int cc, int cr, int dc, int dr) {
		
		if(cc == dc && cr == dr) {
			System.out.println(ans);
			return;
		}
		
		if(cc > dc  || cr > dr) {
			return;
		}
		
		//horizontal
		path(ans+"H", cc+1, cr, dc, dr);
		
		//vertical
		path(ans+"V", cc, cr+1, dc, dr);	
	}
}
