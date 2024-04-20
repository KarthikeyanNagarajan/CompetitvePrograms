package com.karthik.practice.BinarySearchTree.Q08_ConstructBinarySearchTreeFromPreOrder;

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

public class ConstructBinarySearchTreeFromPreOrder
{

	public static TreeNode bstFromPreOrder(int[] A)
	{
		return bstFromPreOrder(A, Integer.MAX_VALUE, new int[] { 0 });
	}

	public static TreeNode bstFromPreOrder(int[] A, int bound, int[] i)
	{
		if (i[0] == A.length || A[i[0]] > bound)
			return null;

		TreeNode root = new TreeNode(A[i[0]++]);
		root.left = bstFromPreOrder(A, root.val, i);
		root.right = bstFromPreOrder(A, bound, i);
		return root;
	}

	public static void main(String[] args)
	{
		int[] A = {10, 5, 1, 7, 15, 12, 17};		
		System.out.println(bstFromPreOrder(A).val);
	}

}
