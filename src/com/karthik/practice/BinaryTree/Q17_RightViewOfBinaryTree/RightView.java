package com.karthik.practice.BinaryTree.Q17_RightViewOfBinaryTree;

import java.util.ArrayList;
import java.util.List;

class Node
{
	int data;
	Node left;
	Node right;

	Node(int val)
	{
		data = val;
		left = null;
		right = null;
	}
}

public class RightView
{

	public static void rightView(Node root, List<Integer> ans, int currDepth)
	{
		if (root == null)
			return;

		if (currDepth == ans.size())
			ans.add(root.data);

		rightView(root.right, ans, currDepth + 1);
		rightView(root.left, ans, currDepth + 1);
	}

	public static List<Integer> rightViewUtil(Node root)
	{
		List<Integer> ans = new ArrayList<>();
		rightView(root, ans, 0);
		return ans;
	}

	public static void main(String[] args)
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(4);
		root.left.right = new Node(10);
		root.left.left.right = new Node(5);
		root.left.left.right.right = new Node(6);
		root.right = new Node(3);
		root.right.right = new Node(10);
		root.right.left = new Node(9);

		List<Integer> rightView = rightViewUtil(root);

		System.out.print("Right View Traversal: ");
		for (int node : rightView)
		{
			System.out.print(node + " ");
		}
		System.out.println();
	}
}
