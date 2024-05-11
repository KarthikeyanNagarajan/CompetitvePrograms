package com.karthik.practice.BinaryTree.Q19_RootToNodePathOfBinaryTree;

import java.util.ArrayList;

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

public class RootToNodePath
{
	public static boolean getPath(Node root, int x, ArrayList<Integer> ans)
	{
		if (root == null)
			return false;

		ans.add(root.val);

		if (root.val == x)
			return true;

		if (getPath(root.left, x, ans) || getPath(root.right, x, ans))
			return true;

		ans.remove(ans.size() - 1);

		return false;
	}

	public static ArrayList<Integer> solve(Node root, int x)
	{
		ArrayList<Integer> ans = new ArrayList<>();
		if (root == null)
			return ans;

		getPath(root, x, ans);

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

		System.out.println(solve(root, 6));
	}

}
