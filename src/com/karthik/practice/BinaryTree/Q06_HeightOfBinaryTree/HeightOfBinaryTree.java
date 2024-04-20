package com.karthik.practice.BinaryTree.Q06_HeightOfBinaryTree;

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

public class HeightOfBinaryTree
{

	private static int heightOfBinaryTree(TreeNode root)
	{
		if (root == null)
			return 0;
		int lh = heightOfBinaryTree(root.left);
		int rh = heightOfBinaryTree(root.right);
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

		int height = heightOfBinaryTree(root);
		System.out.println(height);
	}

}
