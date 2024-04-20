package com.karthik.practice.LinkedList.Q37_ReverseAlternativelyInGroupOfK;

public class Reverse
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

	public Node reverse(Node head, int k)
	{
		if (k <= 1 || head == null || head.next == null)
			return head;
		Node prev = null;
		Node next = null;
		Node node = head;
		int i = 0;
		while (node != null && i < k)
		{
			next = node.next;
			node.next = prev;
			prev = node;
			node = next;
			i++;
		}
		i = 0;
		if (next != null)
		{
			head.next = next;
			node = next;
			while (node != null && i < k - 1)
			{
				node = node.next;
				i++;
			}
			if (node != null)
				node.next = reverse(node.next, k);
		}
		return prev;
	}

	public static void main(String[] args)
	{
		Reverse list = new Reverse();
		list.pushNode(12);
		list.pushNode(11);
		list.pushNode(9);
		list.pushNode(5);
		list.pushNode(3);
		list.pushNode(2);
		list.printNode();
		int k = 2;
		list.reverse(head, k);
		list.printNode();
	}

}
