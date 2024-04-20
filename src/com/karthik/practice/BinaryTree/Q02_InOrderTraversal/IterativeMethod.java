package com.karthik.practice.BinaryTree.Q02_InOrderTraversal;

import java.util.ArrayList;
import java.util.Stack;


public class IterativeMethod
{

	public static ArrayList<Integer> inOrder(TreeNode node)
	{
		ArrayList<Integer> inOrder = new ArrayList<>();
		Stack<TreeNode> st = new Stack<>();
		TreeNode root = node;
		while(true)
		{
			if(root != null)
			{
				st.push(root);
				root = root.left;
			}
			else
			{
				if(st.isEmpty())
					break;
				root = st.pop();
				inOrder.add(root.val);
				root = root.right;
			}
		}
		return inOrder;
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

		ArrayList<Integer> inOrder = new ArrayList<>();
		inOrder = inOrder(root);

		System.out.print("The inOrder Traversal is : ");
		for (int i = 0; i < inOrder.size(); i++)
		{
			System.out.print(inOrder.get(i) + " ");
		}
	}

}
