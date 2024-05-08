package com.karthik.practice.BinaryTree.Q21_MaxWidthOfBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class Node
{
	int val;
	Node left;
	Node right;

	Node(int x)
	{
		val = x;
		left = null;
		right = null;
	}
}

class Pair
{
	Node node;
	int min;

	Pair(Node node, int min)
	{
		this.node = node;
		this.min = min;
	}
}

public class MaxWidthOfBinaryTree
{
	public static int widthOfBinaryTree(Node root)
	{
		if (root == null)
			return 0;

		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(root, 0));

		int ans = 0;

		while (!q.isEmpty())
		{
			int size = q.size();
			int min = q.peek().min;

			int first = 0, last = 0;

			for (int i = 0; i < size; i++)
			{
				int cur_id = q.peek().min - min;
				Node node = q.peek().node;
				q.poll();

				if (i == 0)
					first = cur_id;
				if (i == size - 1)
					last = cur_id;

				if (node.left != null)
					q.add(new Pair(node.left, cur_id * 2 + 1));
				if (node.right != null)
					q.add(new Pair(node.right, cur_id * 2 + 2));
			}
			ans = Math.max(ans, last - first + 1);
		}
		return ans;
	}

	public static void main(String[] args)
	{
		Node root = new Node(3);
		root.left = new Node(5);
		root.right = new Node(1);
		root.left.left = new Node(6);
		root.left.right = new Node(2);
		root.right.left = new Node(0);
		root.right.right = new Node(8);
		root.left.right.left = new Node(7);
		root.left.right.right = new Node(4);

		int maxWidth = widthOfBinaryTree(root);
		System.out.println("Maximum width of the binary tree is: " + maxWidth);
	}
}
