package bst;

public class BinarySrchTree {
	class BTNode{
		int data;
		BTNode leftChild;
		BTNode rightChild;
	}
	private BTNode root;
	
	public BinarySrchTree(BTNode root) {
		root = null;
	}
	
	public int findMini(BTNode root) {
		BTNode current = root;
		if(root == null) {
			return 0;
		}
		
		while(current.leftChild != null) {
			current = current.leftChild;
		}
		return current.data;
	}
	
	public int findMax(BTNode root) {
		BTNode current = root;
		if(root == null) {
			return 0;
		}
		
		while(current.rightChild != null) {
			current = current.rightChild;
		}
		
		return current.data;
	}
}
