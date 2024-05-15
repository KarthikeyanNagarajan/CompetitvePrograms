package com.karthik.practice.LinkedList.Q02_Reverse;

public class UsingIterative
{
	Node head;

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

	public void printNode()
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("Null" + "\n");
	}

	public void reverse()
	{
		Node prev = null;
		Node next = null;
		Node current = head;
		while (current != null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	public static void main(String[] args)
	{
		UsingIterative list = new UsingIterative();
		for (int i = 5; i >= 1; i--)
		{
			list.pushNode(i);
		}
		list.printNode();
		list.reverse();
		list.printNode();
	}

}
