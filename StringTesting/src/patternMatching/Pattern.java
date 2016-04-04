package patternMatching;

public class Pattern {

		String str, st;
		Pattern(String str, String st){
			this.str = str;
			this.st = st;
		}
		int numberOfWays(){
			int m = str.length();
			int n = st.length();
			int count = 0;
			int j;
			for(int i=0; i<m-n;i++){
				for(j = 0; j<n ;j++){
					if(str.charAt(i+j) != st.charAt(j))
						break;
				}
				if(j == n)
					count++;
			}
			return count;
		}
		public static void main(String args[]){
			Pattern p1 = new Pattern("anurag agrawal","ra");
			System.out.println(p1.numberOfWays());
			
		}
}
