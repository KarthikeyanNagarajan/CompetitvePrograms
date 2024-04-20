package com.karthik.practice.BinarySearchTree.Q03_FloorInBinarySearchTree;

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

public class FloorInBinarySearchTree
{

	public static int floor(TreeNode root, int val)
	{
		int floor = -1;
		while(root != null)
		{
			if(root.val == val)
			{
				floor = root.val;
				return floor;
			}
			
			if(val > root.val)
			{
				floor = root.val;
				root = root.right;
			}
			else
			{				
				root = root.left;
			}
		}
		return floor;
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

		System.out.println(floor(root, 12));
	}

}
