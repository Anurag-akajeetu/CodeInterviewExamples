package patternMatching;
import java.util.*;
public class PrimeExpressible {
	Integer x[];
	PriorityQueue<Integer> p = new PriorityQueue<Integer>();
	PriorityQueue<Integer> res = new PriorityQueue<Integer>();
	Set<Integer> set = new HashSet<Integer>();
	PrimeExpressible(int limit){
		x = new Integer[limit];
	}
	void printNumber(int[] array, int limit){
		Arrays.sort(array);
		if(limit ==0){
			return;
		}
		p.offer(1);
		res.offer(1);
		int i = 0;
		int e = -1;
		while(i < limit){
			e = p.poll();
			for(int k=0 ;k<array.length;k++){
				if(!set.contains(e*array[k])){
					set.add(e*array[k]);
					p.offer(e*array[k]);
					res.offer(e*array[k]);
					i++;
				}
			}		
		}
	}
	void traverse(){
		Iterator it = res.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
		System.out.println();
	}
	public static void main(String args[]){
		PrimeExpressible p = new PrimeExpressible(10);
		int array[] = {2,3};
		p.printNumber(array, 8);
		p.traverse();
	}
}
