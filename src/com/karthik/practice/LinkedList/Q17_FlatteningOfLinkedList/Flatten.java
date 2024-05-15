package com.karthik.practice.LinkedList.Q17_FlatteningOfLinkedList;

class Node
{
	int data;
	Node next;
	Node bottom;

	public Node()
	{
	}

	public Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

public class Flatten
{
	static Node head;

	public void pushNode(int data)
	{
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}

	public void printNode(Node head)
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("Null" + "\n");
	}

	public Node merge(Node a, Node b)
	{
		Node temp = new Node(0);
		Node res = temp;
		while (a != null && b != null)
		{
			if (a.data < b.data)
			{
				temp.bottom = a;
				temp = temp.bottom;
				a = a.bottom;
			}
			else
			{
				temp.bottom = b;
				temp = temp.bottom;
				b = b.bottom;
			}
		}
		if (a != null)
			temp.bottom = a;
		else
			temp.bottom = b;
		return res.bottom;
	}

	public Node flatten(Node root)
	{
		if (root == null || root.next == null)
			return root;
		root.next = flatten(root.next);
		root = merge(root, root.next);
		return root;
	}

	public static void main(String[] args)
	{
		Flatten list = new Flatten();
		list.pushNode(12);
		list.pushNode(11);
		list.pushNode(9);
		list.pushNode(5);
		list.pushNode(3);
		list.pushNode(2);
		list.printNode(head);
		list.flatten(head);
		list.printNode(head);
	}

}
