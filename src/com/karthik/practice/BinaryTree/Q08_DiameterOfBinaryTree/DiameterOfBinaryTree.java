package com.karthik.practice.BinaryTree.Q08_DiameterOfBinaryTree;

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

public class DiameterOfBinaryTree
{

	private static int diameterOfBinaryTree(Node root, int[] arr)
	{
		if (root == null)
			return 0;

		int lh = diameterOfBinaryTree(root.left, arr);
		int rh = diameterOfBinaryTree(root.right, arr);

		arr[0] = Math.max(arr[0], lh + rh);

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

		int[] arr = new int[1];
		diameterOfBinaryTree(root, arr);
		System.out.println(arr[0]);
	}

}
