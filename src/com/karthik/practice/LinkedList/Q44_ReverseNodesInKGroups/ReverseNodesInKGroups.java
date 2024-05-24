package com.karthik.practice.LinkedList.Q44_ReverseNodesInKGroups;

class Node
{
	int data;
	Node next;

	public Node(int data)
	{
		this.data = data;
		this.next = null;
	}

	public Node(int data, Node next)
	{
		this.data = data;
		this.next = next;
	}
}

public class ReverseNodesInKGroups
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

	public static int len(Node head)
	{
		Node temp = head;
		int len = 0;
		while (temp != null)
		{
			len++;
			temp = temp.next;
		}
		return len;
	}

	public static Node rotateKGroups(Node head, int k)
	{
		if (head == null || k == 1)
			return head;

		int len = len(head);

		Node dummy = new Node(0, head);

		Node prev = dummy;
		Node next = null;
		Node cur = head;

		for (int i = 0; i < len / k; i++)
		{
			for (int j = 0; j < k - 1; j++)
			{
				next = cur.next;
				cur.next = next.next;
				next.next = prev.next;
				prev.next = next;
			}
			prev = cur;
			cur = cur.next;
		}
		return dummy.next;
	}

	public static void main(String[] args)
	{
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		printNode(head);

		int k = 2;
		head = rotateKGroups(head, k);
		printNode(head);

	}

}
