package com.karthik.practice.BinaryTree.Q16_LeftViewOfBinaryTree;

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

public class LeftView
{

	public static void leftView(Node root, List<Integer> ans, int currDepth)
	{
		if (root == null)
			return;

		if (currDepth == ans.size())
			ans.add(root.data);

		leftView(root.left, ans, currDepth + 1);
		leftView(root.right, ans, currDepth + 1);
	}

	public static List<Integer> leftViewUtil(Node root)
	{
		List<Integer> ans = new ArrayList<>();
		leftView(root, ans, 0);
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

		List<Integer> leftView = leftViewUtil(root);

		System.out.print("Left View Traversal: ");
		for (int node : leftView)
		{
			System.out.print(node + " ");
		}
		System.out.println();

	}
}
