package com.karthik.practice.BinaryTree.Q28_SerializeDeserializeBinaryTree;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

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

public class SerializeDeserializeBinaryTree
{

	public String serialize(TreeNode root)
	{
		StringBuilder sb = new StringBuilder();
		preorder(root, sb);
		return sb.toString();
	}

	private void preorder(TreeNode root, StringBuilder sb)
	{
		if (root == null)
		{
			sb.append("n ");
			return;
		}
		sb.append(root.val).append(" ");
		preorder(root.left, sb);
		preorder(root.right, sb);
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data)
	{
		String[] vals = data.split(" ");
		Queue<String> q = new ArrayDeque<>(Arrays.asList(vals));
		return preorder(q);
	}

	private TreeNode preorder(Queue<String> q)
	{
		String s = q.poll();
		if (s.equals("n"))
			return null;
		TreeNode root = new TreeNode(Integer.parseInt(s));
		root.left = preorder(q);
		root.right = preorder(q);
		return root;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
