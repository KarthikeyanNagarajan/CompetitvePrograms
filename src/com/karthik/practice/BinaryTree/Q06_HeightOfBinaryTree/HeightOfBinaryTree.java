package com.karthik.practice.BinaryTree.Q06_HeightOfBinaryTree;

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

public class HeightOfBinaryTree
{

	private static int heightOfBinaryTree(Node root)
	{
		if (root == null)
			return 0;

		int lh = heightOfBinaryTree(root.left);
		int rh = heightOfBinaryTree(root.right);

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

		System.out.println(heightOfBinaryTree(root));
	}

}
