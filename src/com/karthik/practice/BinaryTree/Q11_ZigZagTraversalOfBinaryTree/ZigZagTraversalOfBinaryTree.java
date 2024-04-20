package com.karthik.practice.BinaryTree.Q11_ZigZagTraversalOfBinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

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

public class ZigZagTraversalOfBinaryTree
{

	private static List<List<Integer>> zigZagTraversalOfBinaryTree(TreeNode root)
	{
		if (root == null)
			return new ArrayList<>();
		List<List<Integer>> ans = new ArrayList<>();
		Deque<TreeNode> q = new ArrayDeque<>(Arrays.asList(root));
		boolean isLeftToRight = true;

		while (!q.isEmpty())
		{
			List<Integer> currLevel = new ArrayList<>();
			for (int sz = q.size(); sz > 0; --sz)
			{
				TreeNode node = q.poll();
				if (isLeftToRight)
					currLevel.add(node.val);
				else
					currLevel.add(0, node.val);

				if (node.left != null)
					q.offer(node.left);
				if (node.right != null)
					q.offer(node.right);
			}
			ans.add(currLevel);
			isLeftToRight = !isLeftToRight;
		}

		return ans;
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

		zigZagTraversalOfBinaryTree(root);
	}

}
