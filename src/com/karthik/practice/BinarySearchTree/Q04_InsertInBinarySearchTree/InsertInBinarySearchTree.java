package com.karthik.practice.BinarySearchTree.Q04_InsertInBinarySearchTree;

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

public class InsertInBinarySearchTree
{

	public static TreeNode insert(TreeNode root, int val)
	{
		if(root == null)
			return new TreeNode(val);
		
		TreeNode curr = root;
		while(true)
		{
			if(curr.val < val)
			{
				if(curr.right != null)
					curr = curr.right;
				else
				{
					curr.right = new TreeNode(val);
					break;
				}
			}
			else
			{
				if(curr.left != null)
					curr = curr.left;
				else
				{
					curr.left = new TreeNode(val);
					break;
				}
			}
		}
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

		TreeNode insert = insert(root, 13);
		System.out.println(insert.val);
	}

}
