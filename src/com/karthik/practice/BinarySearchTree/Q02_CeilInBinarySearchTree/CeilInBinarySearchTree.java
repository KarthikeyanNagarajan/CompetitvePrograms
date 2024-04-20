package com.karthik.practice.BinarySearchTree.Q02_CeilInBinarySearchTree;

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

public class CeilInBinarySearchTree
{

	public static int ceil(TreeNode root, int val)
	{
		int ceil = -1;
		while(root != null)
		{
			if(root.val == val)
			{
				ceil = root.val;
				return ceil;
			}
			
			if(val > root.val)
				root = root.right;
			else
			{
				ceil = root.val;
				root = root.left;
			}
		}
		return ceil;
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

		System.out.println(ceil(root, 12));
	}

}
