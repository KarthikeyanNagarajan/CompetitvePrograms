package com.karthik.practice.BinaryTree.Q11_ZigZagTraversalOfBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node
{
	int val;
	Node left;
	Node right;

	Node(int val)
	{
		this.val = val;
		this.left = null;
		this.right = null;
	}
}

public class ZigZagTraversalOfBinaryTree
{

	private static List<List<Integer>> zigZagTraversalOfBinaryTree(Node root)
	{
		List<List<Integer>> ans = new ArrayList<>();

		if (root == null)
			return ans;

		Queue<Node> q = new LinkedList<>();
		q.offer(root);

		boolean isLeftToRight = true;

		while (!q.isEmpty())
		{
			int size = q.size();

			List<Integer> subList = new ArrayList<>();

			for (int i = 0; i < size; i++)
			{
				Node node = q.peek();
				q.poll();

				if (node.left != null)
					q.offer(node.left);
				if (node.right != null)
					q.offer(node.right);

				if (isLeftToRight)
					subList.add(node.val);
				else
					subList.add(0, node.val);
			}
			ans.add(subList);
			isLeftToRight = !isLeftToRight;
		}

		return ans;
	}

	public static void main(String[] args)
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right = new Node(3);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		System.out.println(zigZagTraversalOfBinaryTree(root));
	}

}
