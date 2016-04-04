package SlectionAlgo;
import java.util.*;
public class permutationString {
		ArrayList<String> permutation(String s){
			if(s == null)
				return null;
			int st;
			int length = s.length();
			ArrayList<String> result = new ArrayList<String>();
			result.add("");
			for(int i=0 ; i< length ; i++){
				ArrayList<String> temp = new ArrayList<String>();
				for(String a: result){
					//System.out.println("Result "+ a);
					temp.add(a);
				}
				for(String a: temp){
					//System.out.println(s.substring(i, i+1));
					a =a.concat(s.substring(i, i+1));
					//System.out.println("After "+a);
					result.add(a);
				}
			}
			return result;
		}
		public static void main(String args[]){
			
			permutationString p1 = new permutationString();
			String st = "anu";
			ArrayList<String> result = p1.permutation(st);
			for(String a: result){
				System.out.println(a);
			}
		}
}
