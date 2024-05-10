package com.karthik.practice.BinaryTree.Q27_ConstructBinaryTreeFromInorderAndPostorder;

import java.util.HashMap;
import java.util.Map;

class Node
{
	int val;
	Node left;
	Node right;

	public Node(int x)
	{
		val = x;
		left = null;
		right = null;
	}
}

public class ConstructBinaryTreeFromInorderAndPostorder
{
	public static Node buildTree(int[] postorder, int[] inorder)
	{
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < inorder.length; i++)
			map.put(inorder[i], i);

		Node node = buildTree(postorder, 0, postorder.length - 1, inorder, 0, inorder.length - 1, map);
		return node;
	}

	public static Node buildTree(int[] postorder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd,
			Map<Integer, Integer> map)
	{
		if (postStart > postEnd || inStart > inEnd)
			return null;

		Node cur = new Node(postorder[postEnd]);

		int inRoot = map.get(cur.val);
		int numsLeft = inRoot - inStart;

		cur.left = buildTree(postorder, postStart, postStart + numsLeft - 1, inorder, inStart, inRoot - 1, map);
		cur.right = buildTree(postorder, postStart + numsLeft, postEnd - 1, inorder, inRoot + 1, inEnd, map);

		return cur;
	}

	public static void main(String[] args)
	{
		int[] inorder = { 40, 20, 50, 10, 60, 30 };
		int[] postorder = { 40, 50, 20, 60, 30, 10 };

		System.out.print("Inorder Vector: ");
		printVector(inorder);

		System.out.print("PostOrder Vector: ");
		printVector(postorder);

		Node root = buildTree(postorder, inorder);

		System.out.println("Inorder of Unique Binary Tree Created:");
		printInorder(root);
		System.out.println();
	}

	private static void printVector(int[] vec)
	{
		for (int i = 0; i < vec.length; i++)
		{
			System.out.print(vec[i] + " ");
		}
		System.out.println();
	}

	private static void printInorder(Node root)
	{
		if (root != null)
		{
			printInorder(root.left);
			System.out.print(root.val + " ");
			printInorder(root.right);
		}
	}
}
