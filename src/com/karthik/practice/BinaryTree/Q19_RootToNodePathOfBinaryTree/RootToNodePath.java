package com.karthik.practice.BinaryTree.Q19_RootToNodePathOfBinaryTree;

import java.util.ArrayList;

class TreeNode
{
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode()
	{
	}

	TreeNode(int val)
	{
		this.val = val;
	}
}

public class RootToNodePath
{
	public static boolean getPath(TreeNode root, ArrayList<Integer> arr, int x)
	{
		if (root == null)
			return false;

		arr.add(root.val);

		if (root.val == x)
			return true;

		if (getPath(root.left, arr, x) || getPath(root.right, arr, x))
			return true;

		arr.remove(arr.size() - 1);

		return false;
	}

	public static ArrayList<Integer> solve(TreeNode A, int B)
	{
		ArrayList<Integer> arr = new ArrayList<>();
		if (A == null)
			return arr;

		getPath(A, arr, B);

		return arr;
	}

	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);

		solve(root, 3);
	}

}
