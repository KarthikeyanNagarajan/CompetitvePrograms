package com.karthik.practice.BinarySearchTree.Q06_CheckIfTreeIsBinarySearchTree;

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

public class CheckIfTreeIsBinarySearchTree
{

	public static boolean isValidBST(TreeNode root)
	{
		return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	public static boolean isValidBST(TreeNode root, long minVal, long maxVal)
	{
		if (root == null)
			return true;

		if (root.val >= maxVal || root.val <= minVal)
			return false;

		return isValidBST(root.left, minVal, root.val) && isValidBST(root.right, root.val, maxVal);
	}

	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(7);
		root.right = new TreeNode(15);
		root.right.left = new TreeNode(12);
		root.right.right = new TreeNode(17);

		System.out.println(isValidBST(root));
	}

}
