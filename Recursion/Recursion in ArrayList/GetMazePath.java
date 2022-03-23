import java.util.*;
public class GetMazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		ArrayList<String> paths = getMazePaths(1, 1, n, m);
		System.out.println(paths);
	}
	
	// sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
    	
    	if(sr == dr && sc == dc) {
    		ArrayList<String> bres = new ArrayList<>();
    		bres.add("");
    		return bres;
    	}
    	
    	
    	
    	
    	ArrayList<String> hpaths = new ArrayList<>();
    	ArrayList<String> vpaths = new ArrayList<>();
    	
    	
    	
    	
    	if(sc < dc) { 
    		hpaths = getMazePaths(sr, sc + 1, dr, dc);
    	}
    	
    	if(sr < dr) { 
    		vpaths = getMazePaths(sr + 1, sc, dr, dc);
    	}
    	
    	
    	ArrayList<String> paths = new ArrayList<>();
    	
    	for(String hpath: hpaths) {
    		paths.add("h" + hpath);
    	}
    	
    	for(String vpath: vpaths) {
    		paths.add("v" + vpath);
    	}
    	
    	return paths;
    }

}
