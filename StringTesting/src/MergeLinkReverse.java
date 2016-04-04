import java.util.*;

public class MergeLinkReverse {
	node rootFirst;
	node rootSecond;
	node result;
	class node{
		int a;
		node next;
		node(int value){
			this.a = value;
			this.next = null;
		}
		
	}
	
	void createListFirst(){
		rootFirst = new node(5);
		rootFirst.next = new node(10);
		rootFirst.next.next = new node(15);
		rootFirst.next.next.next = new node(45);
		traverse(rootFirst);
		createListSecond();
	}
	void createListSecond(){
		rootSecond = new node(2);
		rootSecond.next = new node(3);
		rootSecond.next.next = new node(20);
		traverse(rootSecond);
		mergeList();
	}
	void mergeList(){
		node tF = rootFirst;
		node tS = rootSecond;
		
		while(tF != null && tS != null){
			
			if(tF.a < tS.a){
				if(result == null){
					result = new node(tF.a);
				}else{
					node temp = new node(tF.a);
					temp.next = result;
					result = temp;
				}
				tF = tF.next;
			}else{
				if(result == null){
					result = new node(tS.a);
				}else{
					node temp = new node(tS.a);
					temp.next = result;
					result = temp;
				}
				tS = tS.next;
			}
			
		}
		while(tF != null){
			if(result == null){
				result = new node(tF.a);
			}else{
				node temp = new node(tF.a);
				temp.next = result;
				result = temp;
			}
			tF = tF.next;
		}
		while(tS != null){
			if(result == null){
				result = new node(tS.a);
			}else{
				node temp = new node(tS.a);
				temp.next = result;
				result = temp;
			}
			tS = tS.next;
		}
		traverse(result);
	}
	void traverse(node traverse){
		
		while(traverse != null){
			System.out.print(" "+ traverse.a);
			traverse = traverse.next;
		}
		System.out.println(" ");
		
	}
	public static void main(String args[]){
		
		MergeLinkReverse m = new MergeLinkReverse();
		
		m.createListFirst();
		
	}
}
