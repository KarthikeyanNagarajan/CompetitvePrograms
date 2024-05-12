package com.karthik.practice.BinarySearchTree.Q10_InorderSuccessorInBinarySearchTree;

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

public class InorderSuccessorInBinarySearchTree
{

	public static TreeNode successor(TreeNode root, TreeNode p)
	{
		TreeNode successor = null;
		
		while(root != null)
		{
			if(p.val >= root.val)
				root = root.right;
			else
			{
				successor = root;
				root= root.left;
			}
		}
		return successor;
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
		
		System.out.println(successor(root, root.left.left).val);
	}

}
