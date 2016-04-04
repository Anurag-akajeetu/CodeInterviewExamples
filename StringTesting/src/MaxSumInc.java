import java.util.*;
public class MaxSumInc {
    int a[];
    MaxSumInc(int a[]){
    	
    	this.a = a;
    	
    }
	void maxSum(){
		
		int sum[] = new int[a.length];
		int index[] = new int[a.length];
		
		for(int i=0; i<a.length;i++){
			sum[i] = a[i];		
		}
		for(int i=1; i<a.length; i++){
			for(int j=0 ; j<i; j++){
				if(a[i] > a[j] && sum[i] < a [i] + sum[j])
					sum[i] = sum[j] +a[i];
			}
		}
		
		int max = 0;
		for(int j=0;j<sum.length;j++){
			if(max < sum[j]){
				max = sum[j];
			}
		}
		System.out.println(" "+max);
		
		
	}
	public static void main(String args[]){
	
		
		int a[] = { 4,6,3,5,7,2,43,564,654,342,23,34,45,54};
		
		MaxSumInc i = new MaxSumInc(a);
		i.maxSum();
		
	}
	
}
