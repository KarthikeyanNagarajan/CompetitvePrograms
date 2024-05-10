package com.karthik.practice.BinaryTree.Q28_SerializeDeserializeBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class Node
{
	int val;
	Node left;
	Node right;

	public Node(int x)
	{
		val = x;
		left = null;
		right = null;
	}
}

public class SerializeDeserializeBinaryTree
{
	public static String serialize(Node root)
	{
		if (root == null)
			return "";

		Queue<Node> q = new LinkedList<>();
		q.add(root);

		StringBuilder sb = new StringBuilder();

		while (!q.isEmpty())
		{
			Node node = q.poll();

			if (node == null)
			{
				sb.append("# ");
				continue;
			}

			sb.append(node.val + " ");

			q.add(node.left);
			q.add(node.right);
		}

		return sb.toString();
	}

	public static Node deserialize(String data)
	{
		if (data == "")
			return null;

		String[] split = data.split(" ");

		Node root = new Node(Integer.valueOf(split[0]));

		Queue<Node> q = new LinkedList<>();
		q.add(root);

		for (int i = 1; i < split.length; i++)
		{
			Node parent = q.poll();

			if (!split[i].equals("#"))
			{
				Node left = new Node(Integer.valueOf(split[i]));
				parent.left = left;
				q.add(left);
			}
			if (!split[++i].equals("#"))
			{
				Node right = new Node(Integer.valueOf(split[i]));
				parent.right = right;
				q.add(right);
			}
		}

		return root;
	}

	public static void inorder(Node root)
	{
		if (root == null)
		{
			return;
		}
		inorder(root.left);
		System.out.print(root.val + " ");
		inorder(root.right);
	}

	public static void main(String[] args)
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.right.left = new Node(4);
		root.right.right = new Node(5);

		System.out.print("Orignal Tree: ");
		inorder(root);
		System.out.println();

		String serialized = serialize(root);
		System.out.println("Serialized: " + serialized);

		Node deserialized = deserialize(serialized);
		System.out.print("Tree after deserialization: ");
		inorder(deserialized);
		System.out.println();
	}
}
