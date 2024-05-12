package com.karthik.practice.BinarySearchTree.Q08_LowestCommonAncestorInBinarySearchTree;

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

public class LowestCommonAncestorInBinarySearchTree
{

	public static TreeNode lca(TreeNode root, TreeNode p, TreeNode q)
	{
		if (root == null)
			return null;

		int curr = root.val;

		if (curr < p.val && curr < q.val)
			return lca(root.right, p, q);
		if (curr > p.val && curr > q.val)
			return lca(root.left, p, q);

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

		System.out.println(lca(root, root.left.left, root.right.left).val);
	}

}
