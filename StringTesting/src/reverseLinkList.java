
public class reverseLinkList {
	node head;
	class node{
		int value;
		node next;
		node(int value){
			this.value = value;
			this.next = null;
		}
		
	}
	void createList(){
		if(head == null){
			head = new node(1);
		}else{
			node root = head;
			for(int i=0; i<10; i++){
				node temp = new node(i);
				root.next = temp;
				root = temp;
			}
		}
	}void traverse(node traverse){
		while(traverse != null){
			System.out.print(traverse.value + " ");
		}
		System.out.println(" ");
	}
	void reverseList(){
		
	}
	public static void main(String args[]){
		
		
		
		
	}
}
