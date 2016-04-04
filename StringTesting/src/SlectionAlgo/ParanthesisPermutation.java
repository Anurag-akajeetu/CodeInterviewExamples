package SlectionAlgo;
import java.util.*;
public class ParanthesisPermutation {
	 HashSet<String> permutation(int num){
		 if(num == 0 )
			 return null;
		 HashSet<String> result =  new HashSet<String>();
		 result.add(""); 
		 for(int i = 1 ; i< num; i++){
			 HashSet<String> temp =  new HashSet<String>();
			 for(String a: result){
				 temp.add(a);	 
			 }
			 result.clear();
			 String temp1, temp2;
			 int length;
			 for(String a: temp){
				 if(a.length() == 0){
					 result.add("()");
				 }
				 else{
					 length = a.length();
					 for(int j=0;j<= length/2;j++){
						 temp1 = a.substring(0,j);
						 temp2 = a.substring(j,a.length());
						 temp2 = temp1 + "()" + temp2;
						 result.add(temp2);
					 }
				 } 
			 }
		 }
		 return result;	 
	}
	public static void main(String args[]){
		ParanthesisPermutation p1 = new ParanthesisPermutation();
		HashSet<String> set = new HashSet<String>();
		set = p1.permutation(5);
		for(String a: set){
			System.out.println(" "+ a);
		}
		
	}
}
