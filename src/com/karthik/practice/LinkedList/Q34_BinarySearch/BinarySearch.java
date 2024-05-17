package com.karthik.practice.LinkedList.Q34_BinarySearch;

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

public class BinarySearch
{
	public static void printNode(Node head)
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("Null" + "\n");
	}

	public static Node getMiddle(Node low, Node high)
	{
		Node slow = low;
		Node fast = low.next;
		while (fast != null && fast.next != null && fast != high)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public static Node search(Node head, int val)
	{
		Node low = head;
		Node high = null;
		while (low != high)
		{
			Node mid = getMiddle(low, high);

			if (mid == null)
				return null;

			if (mid.data == val)
				return mid;

			if (mid.data < val)
				low = mid.next;
			else
				high = mid;
		}
		return null;
	}

	public static void main(String[] args)
	{
		Node head = new Node(2);
		head.next = new Node(3);
		head.next.next = new Node(5);
		head.next.next.next = new Node(9);
		head.next.next.next.next = new Node(11);
		head.next.next.next.next.next = new Node(12);

		printNode(head);
		Node ans = search(head, 5);

		if (ans != null)
			System.out.println("Found");
		else
			System.out.println("Not found");
	}

}
