package com.karthik.practice.LinkedList.Q32_PointToHigherValueWithRandomPointer;

public class RandomPointer
{
	static Node head;

	class Node
	{
		int data;
		Node next;
		Node random;

		public Node(int data)
		{
			this.data = data;
			this.next = null;
			this.random = null;
		}
	}

	public void pushNode(int data)
	{
		Node new_node = new Node(data);
		new_node.next = head;
		new_node.random = head;
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

	public Node getMiddle(Node head)
	{
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public Node arbitraryPoint()
	{
		if (head == null || head.next == null)
			return head;
		Node node = head;
		while (node != null)
		{
			node.random = node.next;
			node = node.next;
		}
		sort(head);
		return head;
	}

	public Node merge(Node h1, Node h2)
	{
		if (h1 == null)
			return h2;
		if (h2 == null)
			return h1;

		// start with the linked list
		// whose head data is the least
		if (h1.data < h2.data)
		{
			h1.next = merge(h1.next, h2);
			return h1;
		}
		else
		{
			h2.next = merge(h1, h2.next);
			return h2;
		}
	}

	public Node sort(Node node)
	{
		if (node == null || node.next == null)
			return node;
		Node middle = getMiddle(node);
		Node second = middle.random;
		middle.random = null;
		return merge(sort(node), sort(second));
	}

	public static void main(String[] args)
	{
		RandomPointer list = new RandomPointer();
		list.pushNode(12);
		list.pushNode(11);
		list.pushNode(9);
		list.pushNode(5);
		list.pushNode(3);
		list.pushNode(2);
		list.printNode();
		list.arbitraryPoint();
		list.printNode();
	}

}
