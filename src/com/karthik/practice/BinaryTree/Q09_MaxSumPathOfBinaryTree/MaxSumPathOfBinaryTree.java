package com.karthik.practice.BinaryTree.Q09_MaxSumPathOfBinaryTree;

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

public class MaxSumPathOfBinaryTree
{

	private static int maxSumPathOfBinaryTree(TreeNode root, int[] arr)
	{
		if (root == null)
			return 0;
		int lh = Math.max(0, maxSumPathOfBinaryTree(root.left, arr));
		int rh = Math.max(0, maxSumPathOfBinaryTree(root.right, arr));
		arr[0] = Math.max(arr[0], lh + rh + root.val);
		return root.val + Math.max(lh, rh);
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

		int[] arr = new int[1];
		arr[0] = Integer.MIN_VALUE;
		maxSumPathOfBinaryTree(root, arr);
		System.out.println(arr[0]);
	}

}
