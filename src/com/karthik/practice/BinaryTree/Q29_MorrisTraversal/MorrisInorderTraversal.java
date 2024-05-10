package com.karthik.practice.BinaryTree.Q29_MorrisTraversal;

import java.util.ArrayList;
import java.util.List;

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

public class MorrisInorderTraversal
{
	public static List<Integer> inorder(Node root)
	{
		List<Integer> inorder = new ArrayList<>();
		Node cur = root;

		while (cur != null)
		{
			if (cur.left == null)
			{
				inorder.add(cur.val);
				cur = cur.right;
			}
			else
			{
				Node prev = cur.left;
				while (prev.right != null && prev.right != cur)
				{
					prev = prev.right;
				}

				if (prev.right == null)
				{
					prev.right = cur;
					cur = cur.left;
				}
				else
				{
					prev.right = null;
					inorder.add(cur.val);
					cur = cur.right;
				}
			}
		}

		return inorder;
	}

	public static void main(String[] args)
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.right = new Node(6);

		List<Integer> inorder = inorder(root);

		System.out.print("Binary Tree Morris Inorder Traversal: ");
		for (int i = 0; i < inorder.size(); i++)
		{
			System.out.print(inorder.get(i) + " ");
		}
		System.out.println();
	}
}
