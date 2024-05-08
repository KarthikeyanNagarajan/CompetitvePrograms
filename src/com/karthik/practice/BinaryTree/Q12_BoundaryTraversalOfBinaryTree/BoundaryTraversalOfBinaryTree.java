package com.karthik.practice.BinaryTree.Q12_BoundaryTraversalOfBinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

public class BoundaryTraversalOfBinaryTree
{

	public static boolean isLeaf(Node root)
	{
		return root.left == null && root.right == null;
	}

	public static void addLeftBoundary(Node root, List<Integer> res)
	{
		Node cur = root.left;
		while (cur != null)
		{
			if (!isLeaf(cur))
			{
				res.add(cur.data);
			}
			if (cur.left != null)
				cur = cur.left;
			else
				cur = cur.right;
		}
	}

	public static void addRightBoundary(Node root, List<Integer> res)
	{
		Node cur = root.right;
		Stack<Integer> st = new Stack<>();
		while (cur != null)
		{
			if (!isLeaf(cur))
			{
				st.add(cur.data);
			}
			if (cur.right != null)
				cur = cur.right;
			else
				cur = cur.left;
		}

		while (!st.isEmpty())
		{
			res.add(st.pop());
		}
	}

	public static void addLeaves(Node root, List<Integer> res)
	{
		if (isLeaf(root))
		{
			res.add(root.data);
			return;
		}

		if (root.left != null)
			addLeaves(root.left, res);

		if (root.right != null)
			addLeaves(root.right, res);

	}

	public static List<Integer> printBoundary(Node root)
	{
		List<Integer> ans = new ArrayList<>();
		if (root == null)
			return ans;
		if (!isLeaf(root))
			ans.add(root.data);

		addLeftBoundary(root, ans);
		addLeaves(root, ans);
		addRightBoundary(root, ans);

		return ans;
	}

	public static void printResult(List<Integer> result)
	{
		for (int val : result)
		{
			System.out.print(val + " ");
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		List<Integer> result = printBoundary(root);

		System.out.print("Boundary Traversal: ");
		printResult(result);
	}
}
