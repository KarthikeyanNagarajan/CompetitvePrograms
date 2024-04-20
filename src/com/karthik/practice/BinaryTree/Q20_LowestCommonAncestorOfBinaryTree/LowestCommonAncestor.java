package com.karthik.practice.BinaryTree.Q20_LowestCommonAncestorOfBinaryTree;

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

		TreeNode p = new TreeNode(1);
		p.left = new TreeNode(2);
		p.left.left = new TreeNode(4);
		p.left.right = new TreeNode(5);
		p.right = new TreeNode(3);
		p.right.left = new TreeNode(6);
		p.right.right = new TreeNode(7);

		TreeNode q = new TreeNode(1);
		q.left = new TreeNode(2);
		q.left.left = new TreeNode(4);
		q.left.right = new TreeNode(5);
		q.right = new TreeNode(3);
		q.right.left = new TreeNode(6);
		q.right.right = new TreeNode(7);

		System.out.println(lowestCommonAncestor(root, p, q).val);
	}

}
