package com.karthik.practice.BinaryTree.Q07_BalancedBinaryTree;

class Node
{
	int val;
	Node left;
	Node right;

	Node(int val)
	{
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

public class BalancedBinaryTree
{

	private static int balancedBinaryTree(Node root)
	{
		if (root == null)
			return 0;

		int lh = balancedBinaryTree(root.left);
		if (lh == -1)
			return -1;

		int rh = balancedBinaryTree(root.right);
		if (rh == -1)
			return -1;

		if (Math.abs(lh - rh) > 1)
			return -1;

		return 1 + Math.max(lh, rh);
	}

	public static void main(String[] args)
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right = new Node(3);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		int val = balancedBinaryTree(root);
		System.out.println(val != -1);
	}

}
