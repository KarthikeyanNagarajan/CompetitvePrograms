package com.karthik.practice.LinkedList.Q05_LengthOfLoopOrCycle;

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

public class UsingSlowFastPointer
{
	public static int countNodes(Node n)
	{
		Node temp = n;
		int res = 1;
		while (temp.next != n)
		{
			res++;
			temp = temp.next;
		}
		return res;
	}

	public static int length(Node head)
	{
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
			{
				return countNodes(slow);
			}
		}
		return 0;
	}

	public static void main(String[] args)
	{
		// Create a sample linked list with a loop
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		node1.next = node2;
		Node node3 = new Node(3);
		node2.next = node3;
		Node node4 = new Node(4);
		node3.next = node4;
		Node node5 = new Node(5);
		node4.next = node5;

		// Make a loop from node5 to node2
		node5.next = node2;

		// Set the head of the linked list
		Node head = node1;

		// Detect the loop in the linked list
		System.out.println("Loop Length -> " + length(head));
	}

}
