package com.karthik.practice.BinaryTree.Q24_TimeTakenToBurnBinaryTree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class TreeNode
{
	int val;
	TreeNode left;
	TreeNode right;

	public TreeNode(int x)
	{
		val = x;
		left = null;
		right = null;
	}
}

public class TimeTakenToBurnBinaryTree
{
	public static TreeNode markParents(TreeNode root, Map<TreeNode, TreeNode> parentmap, int start)
	{
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);

		TreeNode res = new TreeNode(-1);

		while (!q.isEmpty())
		{
			TreeNode node = q.poll();
			if (node.val == start)
				res = node;

			if (node.left != null)
			{
				parentmap.put(node.left, node);
				q.add(node.left);
			}
			if (node.right != null)
			{
				parentmap.put(node.right, node);
				q.add(node.right);
			}
		}

		return res;
	}

	public static int distanceK(TreeNode root, int start)
	{
		Map<TreeNode, TreeNode> parentmap = new HashMap<>();
		TreeNode target = markParents(root, parentmap, start);

		Map<TreeNode, Boolean> vis = new HashMap<>();
		vis.put(target, true);

		Queue<TreeNode> q = new LinkedList<>();
		q.add(target);

		int max = 0;

		while (!q.isEmpty())
		{
			int size = q.size();
			int flag = 0;

			for (int i = 0; i < size; i++)
			{
				TreeNode node = q.poll();

				if (node.left != null && vis.get(node.left) == null)
				{
					vis.put(node.left, true);
					q.add(node.left);
					flag = 1;
				}
				if (node.right != null && vis.get(node.right) == null)
				{
					vis.put(node.right, true);
					q.add(node.right);
					flag = 1;
				}
				if (parentmap.get(node) != null && vis.get(parentmap.get(node)) == null)
				{
					vis.put(parentmap.get(node), true);
					q.add(parentmap.get(node));
					flag = 1;
				}
			}
			if (flag == 1)
				max++;
		}

		return max;
	}

	public static void main(String[] args)
	{
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(5);
		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(2);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(4);
		root.right = new TreeNode(1);
		root.right.left = new TreeNode(0);
		root.right.right = new TreeNode(8);

		System.out.println(distanceK(root, 5));
	}
}
