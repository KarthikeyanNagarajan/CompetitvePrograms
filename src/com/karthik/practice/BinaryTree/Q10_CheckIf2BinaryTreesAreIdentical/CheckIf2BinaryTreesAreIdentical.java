package com.karthik.practice.BinaryTree.Q10_CheckIf2BinaryTreesAreIdentical;

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

public class CheckIf2BinaryTreesAreIdentical
{

	private static boolean checkIf2BinaryTreesAreIdentical(TreeNode p, TreeNode q)
	{
		if (p == null || q == null)
			return (p == q);

		return (p.val == q.val) && checkIf2BinaryTreesAreIdentical(p.left, q.left)
				&& checkIf2BinaryTreesAreIdentical(p.right, q.right);
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

		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.left.left = new TreeNode(4);
		root1.left.right = new TreeNode(5);
		root1.right = new TreeNode(3);
		root1.right.left = new TreeNode(6);
		root1.right.right = new TreeNode(7);

		System.out.println(checkIf2BinaryTreesAreIdentical(root, root1));
	}

}
