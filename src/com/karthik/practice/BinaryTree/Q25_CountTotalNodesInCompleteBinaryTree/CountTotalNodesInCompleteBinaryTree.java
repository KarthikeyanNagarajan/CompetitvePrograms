package com.karthik.practice.BinaryTree.Q25_CountTotalNodesInCompleteBinaryTree;

class TreeNode
{
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int x)
	{
		val = x;
		left = null;
		right = null;
	}
}

public class CountTotalNodesInCompleteBinaryTree
{
	public static int findHeightLeft(TreeNode node)
	{
		int height = 0;
		while (node != null)
		{
			height++;
			node = node.left;
		}
		return height;
	}

	public static int findHeightRight(TreeNode node)
	{
		int height = 0;
		while (node != null)
		{
			height++;
			node = node.right;
		}
		return height;
	}

	public static int countNodes(TreeNode root)
	{
		if (root == null)
			return 0;

		int lh = findHeightLeft(root.left);
		int rh = findHeightRight(root.right);

		if (lh == rh)
		{
			return (2 << lh) - 1;
		}

		return 1 + countNodes(root.left) + countNodes(root.right);
	}

	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		root.right.left = new TreeNode(6);

		int totalNodes = countNodes(root);

		System.out.println("Total number of nodes in the Complete Binary Tree: " + totalNodes);
	}
}
