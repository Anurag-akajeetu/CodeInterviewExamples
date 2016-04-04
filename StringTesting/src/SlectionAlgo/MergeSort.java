package SlectionAlgo;
import java.util.*;
import org.json.*;
public class MergeSort {
	int[] a;
	int[] tempArray;
	void initalizeTempArray(int lenght){
		tempArray = new int[lenght];
	}
	void merge(int start, int end, int mid){
		
		int i = start;
		int j= mid+1;
		int k = start;
		System.out.println(" temp array");
		for(int p = start; p<=end ; p++){	
			tempArray[p] = a[p]; 
			System.out.print( " "+a[p] + " ");
		}
		while(i <= mid && j <= end){
			if(tempArray[i] < tempArray[j]){
				a[k] = tempArray[i];
				i++;
			}
			else{
				a[k] = tempArray[j];
				j++;
			}
			k++;
		}
		while(i <= mid){
			a[k] = tempArray[i];
			k++;
			i++;
		}
		while(j <= end){
			a[k] = tempArray[j];
			k++;
			j++;
		}
	}
	void mergeSorting(int start, int end){
		if(start < end){
			int mid = (start + end)/2;
			mergeSorting(mid+1 , end);
			mergeSorting(start, mid);
			merge(start, end, mid);
		}	
	}
	public static void main(String args[]){
		int a[] = {41,1,3,78,45,4,43,454,5};
		System.out.println(" length of array is " + a.length);
		
		MergeSort m1 = new MergeSort();
		m1.a = a;
		m1.initalizeTempArray(m1.a.length);
		m1.mergeSorting(0, m1.a.length - 1);
		
		System.out.print("Sorted Array ");
		
		for(int i =0 ;i< a.length;i++){
			System.out.print(" "+m1.a[i]);
		}
	}
}
