package com.karthik.practice.BinaryTree.Q22_ChildSumPropertyOfBinaryTree;

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

public class ChildSumProperty
{

	public static void childSumProperty(Node root)
	{
		if (root == null)
			return;

		// Add left and right values to child
		int child = 0;
		if (root.left != null)
			child += root.left.val;
		if (root.right != null)
			child += root.right.val;

		if (child >= root.val)
		{
			root.val = child;
		}
		else
		{
			// Assign root value to left and right
			if (root.left != null)
				root.left.val = root.val;
			else if (root.right != null)
				root.right.val = root.val;
		}

		childSumProperty(root.left);
		childSumProperty(root.right);

		// After Recrsion Add left and right values to total
		int total = 0;
		if (root.left != null)
			total += root.left.val;
		if (root.right != null)
			total += root.right.val;

		if (root.left != null || root.right != null)
			root.val = total;
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

		System.out.print("Before modification: ");
		inorder(root);
		System.out.println();

		childSumProperty(root);

		System.out.print("After modification: ");
		inorder(root);
		System.out.println();
	}

	public static void inorder(Node root)
	{
		if (root == null)
			return;

		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
	}

}
