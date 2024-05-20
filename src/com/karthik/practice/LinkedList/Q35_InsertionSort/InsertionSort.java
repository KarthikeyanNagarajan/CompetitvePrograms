package com.karthik.practice.LinkedList.Q35_InsertionSort;

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

public class InsertionSort
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

	public static Node sort(Node head)
	{
		Node dummy = new Node(0);
		while (head != null)
		{
			Node next = head.next;
			Node temp = dummy;
			while (temp.next != null && temp.next.data < head.data)
				temp = temp.next;
			head.next = temp.next;
			temp.next = head;
			head = next;
		}
		return dummy.next;
	}

	public static void main(String[] args)
	{
		Node head = new Node(9);
		head.next = new Node(11);
		head.next.next = new Node(3);
		head.next.next.next = new Node(5);
		head.next.next.next.next = new Node(2);
		head.next.next.next.next.next = new Node(12);

		printNode(head);
		printNode(sort(head));
	}

}
