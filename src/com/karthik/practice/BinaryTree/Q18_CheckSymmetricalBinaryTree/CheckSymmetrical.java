package com.karthik.practice.BinaryTree.Q18_CheckSymmetricalBinaryTree;

class TreeNode
{
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int val)
	{
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

public class CheckSymmetrical
{
	public static boolean isSymmetricUtil(TreeNode left, TreeNode right)
	{
		if (left == null || right == null)
			return left == right;

		if (left.val != right.val)
			return false;

		return isSymmetricUtil(left.left, right.right) || isSymmetricUtil(left.right, right.left);
	}

	public static boolean isSymmetric(TreeNode root)
	{
		return root == null || isSymmetricUtil(root.left, root.right);
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

		System.out.println(isSymmetric(root));
	}

}
