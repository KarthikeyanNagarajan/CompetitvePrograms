package com.karthik.practice.LinkedList.Q33_InsertingNewElement;

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

public class InsertElement
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

	public static void insert(Node head, int num)
	{
		Node newNode = new Node(num);

		Node temp = head;
		while (temp.next != null && temp.next.data < num)
			temp = temp.next;

		newNode.next = temp.next;
		temp.next = newNode;
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
		insert(head, 4);
		printNode(head);
	}

}
