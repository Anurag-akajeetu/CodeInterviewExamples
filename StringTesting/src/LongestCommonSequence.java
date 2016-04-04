import java.io.*;
public class LongestCommonSequence {
	int max(int x, int y){
		return (x > y)? x:y;
	}
	int longSequence(String x, String y, int m, int n){
		
		if(m == 0 || n ==0 )
			return 0;
		else if( x.charAt(m-1) == y.charAt(n-1))
			return 1 + longSequence(x, y, m-1, n-1);
		else
			return max(longSequence(x, y, m, n-1) , longSequence(x, y, m-1, n));		
	}
	
	
	
	
	public static void main(String args[]) throws Exception{
		LongestCommonSequence l1 = new LongestCommonSequence();
		File f = new File("a.txt");
		PrintStream p = new PrintStream(f);
		System.setOut(p);
		String x = "AGGTAB",
			   y = "GXTXAYB"; 
		System.out.println(l1.longSequence(x,y, x.length(), y.length()));
	}
}
