package com.karthik.practice.BinaryTree.Q01_PreOrderTraversal;

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

	public static void preOrder(TreeNode node, ArrayList<Integer> preOrder)
	{
		if(node == null)
			return;
		
		preOrder.add(node.val);
		preOrder(node.left, preOrder);
		preOrder(node.right, preOrder);
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

		ArrayList<Integer> preOrder = new ArrayList<>();
		preOrder(root, preOrder);

		System.out.print("The preOrder Traversal is : ");
		for (int i = 0; i < preOrder.size(); i++)
		{
			System.out.print(preOrder.get(i) + " ");
		}
	}

}
