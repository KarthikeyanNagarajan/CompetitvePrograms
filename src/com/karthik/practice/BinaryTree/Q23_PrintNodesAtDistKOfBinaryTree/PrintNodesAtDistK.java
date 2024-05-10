package com.karthik.practice.BinaryTree.Q23_PrintNodesAtDistKOfBinaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
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

public class PrintNodesAtDistK
{
	public static void markParents(TreeNode root, Map<TreeNode, TreeNode> parentmap)
	{
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty())
		{
			TreeNode node = q.poll();

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
	}

	public static List<Integer> distanceK(TreeNode root, TreeNode target, int k)
	{
		Map<TreeNode, TreeNode> parentmap = new HashMap<>();
		markParents(root, parentmap);

		Map<TreeNode, Boolean> vis = new HashMap<>();
		vis.put(target, true);

		Queue<TreeNode> q = new LinkedList<>();
		q.add(target);

		int curr = 0;

		while (!q.isEmpty())
		{
			int size = q.size();

			if (curr == k)
				break;
			curr++;

			for (int i = 0; i < size; i++)
			{
				TreeNode node = q.poll();

				if (node.left != null && vis.get(node.left) == null)
				{
					vis.put(node.left, true);
					q.add(node.left);
				}
				if (node.right != null && vis.get(node.right) == null)
				{
					vis.put(node.right, true);
					q.add(node.right);
				}
				if (parentmap.get(node) != null && vis.get(parentmap.get(node)) == null)
				{
					vis.put(parentmap.get(node), true);
					q.add(parentmap.get(node));
				}
			}
		}

		List<Integer> ans = new ArrayList<>();
		while (!q.isEmpty())
		{
			TreeNode node = q.poll();
			ans.add(node.val);
		}
		return ans;
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

		System.out.println(distanceK(root, root.left, 2));
	}
}
