package com.karthik.practice.BinaryTree.Q21_ChildSumPropertyOfBinaryTree;

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

public class ChildSumProperty
{

	public static void childSumProperty(TreeNode root)
	{
		if (root == null)
			return;

		int child = 0;
		if (root.left != null)
			child += root.left.val;
		if (root.right != null)
			child += root.right.val;

		if (child >= root.val)
		{
			root.val = child;
		}
		else
		{
			if (root.left != null)
				root.left.val = root.val;
			else if (root.right != null)
				root.right.val = root.val;
		}

		childSumProperty(root.left);
		childSumProperty(root.right);

		int total = 0;
		if (root.left != null)
			total += root.left.val;
		if (root.right != null)
			total += root.right.val;

		if (root.left != null || root.right != null)
			root.val = total;
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

		childSumProperty(root);
	}

}
