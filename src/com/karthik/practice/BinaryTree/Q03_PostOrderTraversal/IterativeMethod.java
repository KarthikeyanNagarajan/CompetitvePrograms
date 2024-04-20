package com.karthik.practice.BinaryTree.Q03_PostOrderTraversal;

import java.util.ArrayList;
import java.util.Stack;

public class IterativeMethod
{

	public static ArrayList<Integer> postOrder(TreeNode node)
	{
		ArrayList<Integer> postOrder = new ArrayList<>();
		Stack<TreeNode> st1 = new Stack<>();
		Stack<TreeNode> st2 = new Stack<>();
		if (node == null)
			return postOrder;
		st1.push(node);
		while (!st1.isEmpty())
		{
			TreeNode root = st1.pop();
			st2.add(root);
			if(root.left != null)
				st1.push(root.left);
			if(root.right != null)
				st1.push(root.right);
		}
		while (!st2.isEmpty())
		{
			postOrder.add(st2.pop().val);
		}
		return postOrder;
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
		postOrder = postOrder(root);

		System.out.print("The postOrder Traversal is : ");
		for (int i = 0; i < postOrder.size(); i++)
		{
			System.out.print(postOrder.get(i) + " ");
		}
	}

}
