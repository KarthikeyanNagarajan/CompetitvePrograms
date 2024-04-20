package com.karthik.practice.BinaryTree.Q05_LevelOrderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

public class LevelOrderTraversal
{

	private static List<List<Integer>> levelOrderTraversal(TreeNode root)
	{
		Queue<TreeNode> queue = new LinkedList<>();
		List<List<Integer>> wrapList = new ArrayList<>();
		if (root == null)
			return wrapList;
		queue.offer(root);
		while (!queue.isEmpty())
		{
			int numLength = queue.size();
			List<Integer> subList = new ArrayList<>();
			for (int i = 0; i < numLength; i++)
			{
				if (queue.peek().left != null)
					queue.offer(queue.peek().left);
				if (queue.peek().right != null)
					queue.offer(queue.peek().right);
				subList.add(queue.poll().val);
			}
			wrapList.add(subList);
		}
		return wrapList;
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
		List<List<Integer>> wrapList = new ArrayList<>();
		wrapList = levelOrderTraversal(root);
		System.out.println(wrapList);
	}

}
