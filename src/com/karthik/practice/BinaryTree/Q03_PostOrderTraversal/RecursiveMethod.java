package com.karthik.practice.BinaryTree.Q03_PostOrderTraversal;

import java.util.ArrayList;

class TreeNode
{
	int val;
	TreeNode right;
	TreeNode left;

	TreeNode(int val)
	{
		this.val = val;
	}
}

public class RecursiveMethod
{

	public static void postOrder(TreeNode node, ArrayList<Integer> postOrder)
	{
		if (node == null)
			return;
		
		postOrder(node.left, postOrder);
		postOrder(node.right, postOrder);
		postOrder.add(node.val);
	}

	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.left.right.left = new TreeNode(8);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		root.right.right.left = new TreeNode(9);
		root.right.right.right = new TreeNode(10);

		ArrayList<Integer> postOrder = new ArrayList<>();
		postOrder(root, postOrder);

		System.out.print("The postOrder Traversal is : ");
		for (int i = 0; i < postOrder.size(); i++)
		{
			System.out.print(postOrder.get(i) + " ");
		}
	}

}
