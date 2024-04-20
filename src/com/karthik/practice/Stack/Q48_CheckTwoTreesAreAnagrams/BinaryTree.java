package com.karthik.practice.Stack.Q48_CheckTwoTreesAreAnagrams;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BinaryTree
{
	static class Node
	{
		Node left, right;
		int data;

		Node(int data)
		{
			this.data = data;
			left = right = null;
		}
	}

	public static Node newNode(int data)
	{
		Node temp = new Node(data);
		return temp;
	}

	static boolean areAnagrams(Node root1, Node root2)
	{
		if (root1 == null && root2 == null)
			return true;
		if (root1 == null || root2 == null)
			return false;

		Queue<Node> q1 = new LinkedList<>();
		Queue<Node> q2 = new LinkedList<>();
		q1.add(root1);
		q2.add(root2);

		Map<Integer, Integer> m = new HashMap<>();
		while (!q1.isEmpty() && !q2.isEmpty())
		{
			int n1 = q1.size();
			int n2 = q2.size();
			if (n1 != n2)
				return false;
			if (n1 == 0)
				break;
			while (n1-- > 0)
			{
				Node top = q1.peek();
				q1.remove();
				m.put(top.data, (m.getOrDefault(top.data, 0) + 1));
				if (top.left != null)
					q1.add(top.left);
				if (top.right != null)
					q1.add(top.right);
			}

			while (n2-- > 0)
			{
				Node top = q2.peek();
				q2.remove();
				if (!m.containsKey(top.data))
					return false;
				m.put(top.data, (m.get(top.data) - 1));
				if (m.get(top.data) == 0)
					m.remove(top.data);
				if (top.left != null)
					q2.add(top.left);
				if (top.right != null)
					q2.add(top.right);
			}
			if (m.size() > 0)
				return false;
		}
		if (q1.isEmpty() && q2.isEmpty())
			return true;
		return false;
	}

	public static void main(String[] args)
	{
		Node root1 = newNode(1);
		root1.left = newNode(3);
		root1.right = newNode(2);
		root1.right.left = newNode(5);
		root1.right.right = newNode(4);

		Node root2 = newNode(1);
		root2.left = newNode(2);
		root2.right = newNode(3);
		root2.left.left = newNode(4);
		root2.left.right = newNode(5);

		if (areAnagrams(root1, root2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}

}
