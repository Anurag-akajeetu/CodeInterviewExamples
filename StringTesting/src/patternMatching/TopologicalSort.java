package patternMatching;
import java.util.*;
public class TopologicalSort {
	HashMap<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
	HashMap<Integer, Integer> visit = new HashMap<Integer, Integer>();
	
	Stack<Integer> stack = new Stack<Integer>();
	void initialize(int x){
		map.put(x, new LinkedList<Integer>());
		visit.put(x, 0);
		
	}
	void createAdjency(Integer x, Integer y){
			LinkedList temp1;
			temp1 = map.get(x);
			temp1.add(y);
			map.put(x, temp1);
		
	}
	void sort(Integer node){
		
		visit.put(node, visit.get(node) +1);
		LinkedList<Integer> adj;
		adj = map.get(node);
		Integer temp;
		while(!adj.isEmpty()){
			temp = adj.pollLast();
			if(visit.get(temp) == 0)
				sort(temp);
		}
		
		//System.out.print(node+ " ");
		
		stack.push(node);
		
	}
	void sortingTopological(){
		
		Iterator it = map.keySet().iterator();
		Integer node;
		while(it.hasNext()){
			node = (Integer) it.next();
			if(visit.get(node) == 0){
				sort(node);
			}
				
		}
	}
	void traverse(){
		while(!stack.isEmpty()){
			System.out.print(stack.pop() +" ");
		}
	}
	
	public static void main(String args[]){
	
		
		TopologicalSort t1 = new TopologicalSort();
		t1.initialize(0);
		t1.initialize(1);
		t1.initialize(2);
		t1.initialize(3);
		t1.initialize(4);
		t1.initialize(5);
		
		
		t1.createAdjency(5, 2);
		t1.createAdjency(5, 0);
		t1.createAdjency(4, 0);
		t1.createAdjency(4, 1);
		t1.createAdjency(2, 3);
		t1.createAdjency(3, 1);
		
		t1.sortingTopological();
		t1.traverse();
	}
	
}
