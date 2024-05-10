package com.karthik.practice.BinaryTree.Q29_MorrisTraversal;

import java.util.ArrayList;
import java.util.List;

public class MorrisPreorderTraversal
{
	public static List<Integer> preorder(Node root)
	{
		List<Integer> preorder = new ArrayList<>();
		Node cur = root;

		while (cur != null)
		{
			if (cur.left == null)
			{
				preorder.add(cur.val);
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
					preorder.add(cur.val);
					cur = cur.left;
				}
				else
				{
					prev.right = null;
					cur = cur.right;
				}
			}
		}

		return preorder;
	}

	public static void main(String[] args)
	{
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.left.right.right = new Node(6);

		List<Integer> preorder = preorder(root);

		System.out.print("Binary Tree Morris Preorder Traveral: ");
		for (int i = 0; i < preorder.size(); i++)
		{
			System.out.print(preorder.get(i) + " ");
		}
		System.out.println();
	}
}
