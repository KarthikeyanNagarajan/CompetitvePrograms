package com.karthik.practice.BinaryTree.Q15_BottomViewOfBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

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

class Pair
{
	Node node;
	int x;

	Pair(Node node, int x)
	{
		this.node = node;
		this.x = x;
	}
}

public class BottomView
{
	public static ArrayList<Integer> bottomView(Node root)
	{
		ArrayList<Integer> ans = new ArrayList<>();
		if (root == null)
			return ans;

		Map<Integer, Integer> map = new TreeMap<>();

		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(root, 0));

		while (!q.isEmpty())
		{
			Node temp = q.peek().node;
			int x = q.peek().x;
			q.poll();

			map.put(x, temp.val);

			if (temp.left != null)
				q.add(new Pair(temp.left, x - 1));
			if (temp.right != null)
				q.add(new Pair(temp.right, x + 1));
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet())
			ans.add(entry.getValue());

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

		System.out.println(bottomView(root));
	}

}
