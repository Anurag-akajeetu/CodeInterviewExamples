
import java.util.*;

public class RemoveDuplictaes {
	int arr[];
			
	RemoveDuplictaes(int a[]){
		this.arr = a; 
	}		
	int remove(){
		int previous = arr[0], 
			current, 
			temp,
			newIndex = arr.length;
		
		for(int i=1; i<arr.length - 1; i++){
			current = arr[i];
			if(previous == current){
				newIndex--;
				for(int j=current ; j< arr.length - 1;j++){
					arr[j] = arr[j+1];
				}
			}
			else{
				previous = arr[i];
				current = arr[i+1];
			}	
		}	
		return newIndex;
	}
	public static void main(String args[]){
		int a[] = {1,2,564,32, 34,5,5,34,32,564,1};
		Arrays.sort(a);
		RemoveDuplictaes r1 = new RemoveDuplictaes(a);
		int newIndex = r1.remove();
		for(int k=0; k<newIndex; k++){
			System.out.print(r1.arr[k]+" ");
		}
	}
}
