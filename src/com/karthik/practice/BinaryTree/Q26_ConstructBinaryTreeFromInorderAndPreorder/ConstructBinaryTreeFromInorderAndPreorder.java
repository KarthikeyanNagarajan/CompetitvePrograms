package com.karthik.practice.BinaryTree.Q26_ConstructBinaryTreeFromInorderAndPreorder;

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

public class ConstructBinaryTreeFromInorderAndPreorder
{
	public static Node buildTree(int[] preorder, int[] inorder)
	{
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < inorder.length; i++)
			map.put(inorder[i], i);

		Node node = buildTree(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
		return node;
	}

	public static Node buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd,
			Map<Integer, Integer> map)
	{
		if (preStart > preEnd || inStart > inEnd)
			return null;

		Node cur = new Node(preorder[preStart]);

		int inRoot = map.get(cur.val);
		int numsLeft = inRoot - inStart;

		cur.left = buildTree(preorder, preStart + 1, preStart + numsLeft, inorder, inStart, inRoot - 1, map);
		cur.right = buildTree(preorder, preStart + numsLeft + 1, preEnd, inorder, inRoot + 1, inEnd, map);

		return cur;
	}

	public static void main(String[] args)
	{
		int[] inorder = { 9, 3, 15, 20, 7 };
		int[] preorder = { 3, 9, 20, 15, 7 };

		System.out.print("Inorder Vector: ");
		printVector(inorder);

		System.out.print("Preorder Vector: ");
		printVector(preorder);

		Node root = buildTree(preorder, inorder);

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
