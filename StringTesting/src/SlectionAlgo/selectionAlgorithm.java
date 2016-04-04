package SlectionAlgo;
import java.util.*;
public class selectionAlgorithm {
	
	int a[];
	selectionAlgorithm(int a[]){
		this.a = a;
	}
	int selection(int start, int end, int pIndex){
		int pos;
		if(pIndex >= 0  && pIndex < end - start + 1){
			
			pos = partition(start, end);
		
			if(pos - start == pIndex ){ 
				return a[pos];
			}
			else if(pos - start > pIndex){
				return selection(start, pos - 1, pIndex);
			}else{
				return selection(pos+1, end, pIndex - pos + start -1);		
			}
		}
		return 0;
	}
	int partition(int start, int end){
		int x = a[end], i = start;
		int temp;
		for(int j = start; j<end; j++){
			if(a[j] <= x){
				temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				i++;
			}
		}
		temp = a[i];
		a[i] = a[end];
		a[end] = temp;
		return i;
	}
	public static void main(String arg[]) throws Exception{
		int b[] = {2,53,45,35,485,85,42,3,8,4,89,567};
		selectionAlgorithm s1 = new selectionAlgorithm(b);
	    int end = s1.a.length;
	    int pIndex = 11;
		System.out.print(s1.selection(0,end - 1,pIndex));
	    System.out.println(" ");
	    List<Integer> l1 = new ArrayList<Integer>();
		for(int i=0;i<end;i++){
			l1.add(b[i]);
		}
		Collections.sort(l1);
		Iterator<Integer> iterator = l1.iterator();
		while(iterator.hasNext()){
			System.out.print(" "+iterator.next());
		}
	}
}
