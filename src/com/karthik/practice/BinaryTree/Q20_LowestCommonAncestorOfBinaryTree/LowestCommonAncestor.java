package com.karthik.practice.BinaryTree.Q20_LowestCommonAncestorOfBinaryTree;

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

public class LowestCommonAncestor
{
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
	{
		if (root == null || root == p || root == q)
			return root;

		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);

		if (left == null)
			return right;
		else if (right == null)
			return left;
		else
			return root;
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

		TreeNode ans = lowestCommonAncestor(root, root.left.left, root.left.right);

		System.out.println(ans.val);
	}

}
