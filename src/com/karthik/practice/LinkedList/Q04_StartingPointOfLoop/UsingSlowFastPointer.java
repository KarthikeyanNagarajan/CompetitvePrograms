package com.karthik.practice.LinkedList.Q04_StartingPointOfLoop;

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
	public static Node startingPoint(Node head)
	{
		Node slow = head;
		Node fast = head;
		Node entry = head;
		while (fast != null && fast.next != null)
		{
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow)
			{
				while (slow != entry)
				{
					slow = slow.next;
					entry = entry.next;
				}
				return entry;
			}
		}
		return null;
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
		Node loopStartNode = startingPoint(head);

		if (loopStartNode != null)
		{
			System.out.println("Loop detected. Starting node of the loop is: " + loopStartNode.data);
		}
		else
		{
			System.out.println("No loop detected in the linked list.");
		}
	}

}
