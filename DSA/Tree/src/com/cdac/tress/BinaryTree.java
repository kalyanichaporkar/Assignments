package com.cdac.tress;

public class BinaryTree {
	
	class BTNode{
		int data;
		BTNode leftchild;
		BTNode rightchild;
	}
	

	BTNode root;
	
	public BinaryTree() {
		root = null;
	}
	
	public static void inOrder(BTNode root) {
		if(root == null) {
			return;
		}
		if(root.leftchild != null) {
			inOrder(root.leftchild);	
		}
		System.out.println(root.data);
		if(root.rightchild != null) {
			inOrder(root.rightchild);
		}
		return;
	}
}
