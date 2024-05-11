package com.karthik.practice.BinaryTree.Q13_VerticalTraversalOfBinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;

class Node
{
	int data;
	Node left;
	Node right;

	public Node(int val)
	{
		data = val;
		left = null;
		right = null;
	}
}

class Tuple
{
	Node node;
	int x;
	int y;

	public Tuple(Node node, int x, int y)
	{
		this.node = node;
		this.x = x;
		this.y = y;
	}
}

public class VerticalTraversalOfBinaryTree
{

	public static List<List<Integer>> findVertical(Node root)
	{
		Map<Integer, Map<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
		Queue<Tuple> q = new LinkedList<>();
		q.add(new Tuple(root, 0, 0));

		if (!q.isEmpty())
		{
			Node node = q.peek().node;
			int x = q.peek().x;
			int y = q.peek().y;
			q.poll();

			if (!map.containsKey(x))
				map.put(x, new TreeMap<>());

			if (!map.get(x).containsKey(y))
				map.get(x).put(y, new PriorityQueue<>());

			map.get(x).get(y).add(node.data);

			// Above conditions are put in one line, Both are same
			// map.computeIfAbsent(x, k -> new TreeMap<>())
			// .computeIfAbsent(y, k -> new PriorityQueue<>()).add(node.data);

			if (node.left != null)
				q.add(new Tuple(node.left, x - 1, y + 1));
			if (node.right != null)
				q.add(new Tuple(node.right, x + 1, y + 1));
		}

		List<List<Integer>> ans = new ArrayList<>();
		for (Map<Integer, PriorityQueue<Integer>> it : map.values())
		{
			ans.add(new ArrayList<>());
			for (PriorityQueue<Integer> it1 : it.values())
			{
				System.out.println(it1.size());
				while (!it1.isEmpty())
				{
					System.out.println(it1.peek());
					ans.get(ans.size() - 1).add(it1.poll());
				}
			}
		}
		return ans;
	}

	private static void printResult(List<List<Integer>> result)
	{
		for (List<Integer> level : result)
		{
			for (int node : level)
			{
				System.out.print(node + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.left.left = new Node(4);
		root.left.right = new Node(10);
		root.left.left.right = new Node(5);
		root.left.left.right.right = new Node(6);
		root.right = new Node(3);
		root.right.right = new Node(10);
		root.right.left = new Node(9);

		List<List<Integer>> verticalTraversal = findVertical(root);

		System.out.print("Vertical Traversal: ");
		printResult(verticalTraversal);
	}
}
