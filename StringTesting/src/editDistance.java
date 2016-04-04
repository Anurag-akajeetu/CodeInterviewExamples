
public class editDistance {
	
	int min(int x, int y){
		return (x< y)? x:y;
	}
	int mini(int x, int y, int z){
		return min(min(x,y), z);
	}
	
	int editDistance(String arg1, String arg2, int m, int n){
		
		if(m==0) return n;
		else if(n ==0 ) return m;
		else if(arg1.charAt(m-1) == arg2.charAt(n-1))
			return editDistance(arg1, arg2, m-1 , n-1);
		else
		return mini(1 + editDistance(arg1, arg2, m-1, n),
				1 + editDistance(arg1, arg2, m, n - 1),
				3 + editDistance(arg1, arg2, m-1, n-1));
	}
	public static void main(String args[]){
		
		String s = "anu";
		System.out.println(" "+ new editDistance().editDistance(s,s+"r" , 3, 4));
		
		
	}
}
