package binaryTreeSubTree;

public class BinaryTree {
	node root;
	class node {
		int value;
		node right;
		node left;
		node(int value){
			this.value = value;
			right = null;
			left = null;
		}
	}
	void addNode(){	
	}
	boolean isSubtree(node root1, node root2){
		if(root1 == null && root2 == null){
			return true;
		}
		if( root1 == null || root2 == null){
			return false;
		}
		if(root1.value == root2.value){
			boolean left = isSubtree(root1.left, root2.left);
			boolean right =  isSubtree(root1.right, root2.right);
			if(left && right){
				return true;
			}
		}
		return false;
	}
	public static void main(String argsp[]){	
	}
}
