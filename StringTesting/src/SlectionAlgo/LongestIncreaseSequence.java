package SlectionAlgo;

import java.util.*;

public class LongestIncreaseSequence {
	int sum[];
	int arr[];
	int index[];
	LongestIncreaseSequence(int a[]){	
		this.arr = a;
		this.sum = new int[a.length];
		this.index = new int[a.length];
		
		for(int i=0 ;i< a.length;i++){
			sum[i] = arr[i];
			index[i] = -1;
		}
	}
	void lis(){
		if(arr.length == 0){
			return;
		}
		else{
			for(int i=1;i<arr.length;i++){
				for(int j=0;j<i;j++){
					if(arr[j] <= arr[i] && sum[i] < sum[j] + arr[i]){
						sum[i] = sum[j] + arr[i];
						index[i] = j;
					}
				}
			}
		}
		displayLIS();
	}
	void displayLIS(){
		
		int max = sum[0],
			index = 0;
		
		for(int i=1;i<arr.length;i++){
			if(max < sum[i]){
				max = sum[i];
				index = i;
			}
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(index > -1){
			list.add(arr[index]);
			index = this.index[index];
		}
		
		for(Integer a: list){
			System.out.print(a+" ");
		}
		
	}
	public static void main(String args[]){
		int a[] = {50,10};
		LongestIncreaseSequence l = new LongestIncreaseSequence(a);
		l.lis();
		
	}
}
