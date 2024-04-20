package com.karthik.practice.LinkedList.Q02_Reverse;

public class UsingRecursion
{
	static Node head;

	class Node
	{
		int data;
		Node next;

		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}

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

	public static Node reverse(Node head)
	{
		if (head == null || head.next == null)
			return head;
		Node rest = reverse(head.next);
		head.next.next = head;
		head.next = null;
		return rest;
	}

	public static void main(String[] args)
	{
		UsingRecursion list = new UsingRecursion();
		for (int i = 5; i >= 1; i--)
		{
			list.pushNode(i);
		}
		list.printNode(head);
		head = UsingRecursion.reverse(head);
		list.printNode(head);
	}

}
