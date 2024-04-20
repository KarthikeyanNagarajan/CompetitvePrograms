package com.karthik.practice.LinkedList.Q11_RemoveNthNodeFromEnd;

class Node
{
	int data;
	Node next;

	public Node()
	{
	}

	public Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

public class RemoveNthNodeFromEnd
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

	public void remove(Node head, int n)
	{
		Node start = new Node();
		start.next = head;
		Node fast = start;
		Node slow = start;
		for (int i = 1; i <= n; i++)
		{
			fast = fast.next;
		}
		while (fast.next != null)
		{
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
	}

	public static void main(String[] args)
	{
		RemoveNthNodeFromEnd list = new RemoveNthNodeFromEnd();
		list.pushNode(12);
		list.pushNode(11);
		list.pushNode(9);
		list.pushNode(5);
		list.pushNode(3);
		list.pushNode(2);
		list.printNode(head);
		list.remove(head, 3);
		list.printNode(head);
	}
}
