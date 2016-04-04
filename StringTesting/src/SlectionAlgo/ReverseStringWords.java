package SlectionAlgo;

public class ReverseStringWords {

	public static void main(String args[]){
		String st = "Hey";
		String aar[] = st.split(" ");
		int length = aar.length;
		
		System.out.print(" "+ st.charAt(1) );
		st = "";

		for(int i = length - 1; i >= 0 ; i--)
			st = st + aar[i] + " ";
		System.out.println(st);
	}
}
