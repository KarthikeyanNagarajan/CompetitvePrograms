package com.karthik.practice.BinaryTree.Q01_PreOrderTraversal;

import java.util.ArrayList;
import java.util.Stack;

public class IterativeMethod
{

	public static ArrayList<Integer> preOrder(TreeNode node)
	{
		ArrayList<Integer> preOrder = new ArrayList<>();
		Stack<TreeNode> st = new Stack<>();
		if(node == null)
			return preOrder;
		st.push(node);
		while(!st.isEmpty())
		{
			node = st.pop();
			preOrder.add(node.val);
			if(node.right != null)
				st.push(node.right);
			if(node.left != null)
				st.push(node.left);
		}
		return preOrder;
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
		preOrder = preOrder(root);

		System.out.print("The preOrder Traversal is : ");
		for (int i = 0; i < preOrder.size(); i++)
		{
			System.out.print(preOrder.get(i) + " ");
		}
	}

}
