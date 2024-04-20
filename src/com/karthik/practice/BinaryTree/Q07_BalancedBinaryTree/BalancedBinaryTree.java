package com.karthik.practice.BinaryTree.Q07_BalancedBinaryTree;

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

public class BalancedBinaryTree
{

	private static int balancedBinaryTree(TreeNode root)
	{
		if (root == null)
			return 0;
		int lh = balancedBinaryTree(root.left);
		if (lh == -1)
			return -1;
		int rh = balancedBinaryTree(root.right);
		if (rh == -1)
			return -1;
		if (Math.abs(lh - rh) > 1)
			return -1;
		return 1 + Math.max(lh, rh);
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
		int val = balancedBinaryTree(root);
		System.out.println(val != -1);
	}

}
