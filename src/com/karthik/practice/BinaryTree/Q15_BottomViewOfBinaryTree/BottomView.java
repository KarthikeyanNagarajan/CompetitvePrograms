package com.karthik.practice.BinaryTree.Q15_BottomViewOfBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

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

class Pair
{
	int data;
	TreeNode node;

	Pair()
	{
	}

	Pair(TreeNode node, int data)
	{
		this.node = node;
		this.data = data;
	}
}

public class BottomView
{
	public static ArrayList<Integer> topView(TreeNode root)
	{
		ArrayList<Integer> ans = new ArrayList<>();
		if (root == null)
			return ans;

		Map<Integer, Integer> map = new TreeMap<>();
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(root, 0));

		while (!q.isEmpty())
		{
			Pair p = q.remove();
			int dt = p.data;
			TreeNode temp = p.node;

			map.put(dt, temp.val);

			if (temp.left != null)
				q.add(new Pair(temp.left, dt - 1));
			if (temp.right != null)
				q.add(new Pair(temp.right, dt + 1));
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet())
			ans.add(entry.getValue());

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

		ArrayList<Integer> topView = topView(root);
		System.out.println(topView);
	}

}
