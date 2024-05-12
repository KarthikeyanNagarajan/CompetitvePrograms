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
	public static TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q)
	{
		if (root == null || root == p || root == q)
			return root;

		TreeNode left = findLCA(root.left, p, q);
		TreeNode right = findLCA(root.right, p, q);

		if (left == null)
			return right;
		else if (right == null)
			return left;
		else
			return root;
	}

	public static TreeNode findNode(TreeNode root, int n)
	{
		if (root != null)
		{
			if (root.val == n)
			{
				return root;
			}
			else
			{
				TreeNode found = findNode(root.left, n);
				if (found == null)
					found = findNode(root.right, n);
				return found;
			}
		}
		else
			return null;
	}

	public static TreeNode lca(TreeNode root, int n1, int n2)
	{
		TreeNode p = findNode(root, n1);
		TreeNode q = findNode(root, n2);

		return findLCA(root, p, q);
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

		TreeNode ans = lca(root, 4, 5);

		System.out.println(ans.val);
	}

}
