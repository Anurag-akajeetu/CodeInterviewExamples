package SlectionAlgo;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import javax.xml.stream.events.Characters;

public class largestnumber {

	String largestNumber(int a[]){
		
		int length = a.length;
		String st = "";
		for(int i =0 ; i< length ; i++){
			
			st = st + Integer.toString(a[i]);
		}
		char ch[] = st.toCharArray();
		for(int j =0 ; j<ch.length; j++){
			System.out.print(" "+ch[j]);
		}
	
		st = "";
		for(int j =ch.length -1 ; j>=0; j--){
			st = st + Character.toString(ch[j]);
			System.out.print(" "+ch[j]);
		}

		System.out.println(" ");
	 
		
		System.out.println(" "+ st); 
		
		System.out.println(" ");
			
		return null;
	}
	
	public static void main(String args[]){
		int a[] = {6,78,34,67,234,8};
		largestnumber l1 =  new largestnumber();
		System.out.println(" "+ l1.largestNumber(a));
		
	}
}
