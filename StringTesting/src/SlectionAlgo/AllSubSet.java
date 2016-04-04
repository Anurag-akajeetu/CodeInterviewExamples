package SlectionAlgo;
import java.util.*;
public class AllSubSet {
	ArrayList<ArrayList<Integer>> subset(int s[]){
		if(s == null){
			return null;
		}	
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		result.add(new ArrayList<Integer>());	
		for(int i =0 ; i< s.length;i++){
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> a: result){
				temp.add(new ArrayList<Integer>(a));
			}
			for(ArrayList<Integer> a: temp){
				a.add(s[i]);
			}
			result.addAll(temp);
		}
		return result;
	}
	public static void main(String args[]){
		int a[] = {5,2,3};
		ArrayList<ArrayList<Integer>> result = new AllSubSet().subset(a);
		for(ArrayList<Integer> c: result){
			System.out.println(" ");
			for(Integer b: c){
				System.out.print(b+" ");
			}
		}	
	}
}
