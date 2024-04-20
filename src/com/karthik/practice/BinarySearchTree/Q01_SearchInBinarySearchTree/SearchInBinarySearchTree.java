package com.karthik.practice.BinarySearchTree.Q01_SearchInBinarySearchTree;

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

public class SearchInBinarySearchTree
{
	public static TreeNode search(TreeNode root, int val)
	{
		while (root != null && root.val != val)
			root = root.val < val ? root.right : root.left;
		return root;
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

		TreeNode search = search(root, 12);
		System.out.println(search.val);
	}

}
