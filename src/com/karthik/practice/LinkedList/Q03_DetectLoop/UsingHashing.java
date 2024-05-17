package com.karthik.practice.LinkedList.Q03_DetectLoop;

import java.util.HashSet;
import java.util.Set;

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

public class UsingHashing
{
	public static boolean detectLoop(Node head)
	{
		Set<Node> hs = new HashSet<>();
		while (head != null)
		{
			if (hs.contains(head))
				return true;
			else
			{
				hs.add(head);
				head = head.next;
			}
		}
		return false;
	}

	public static void main(String[] args)
	{
		Node head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);

		head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		// Create a loop
		fifth.next = third;

		System.out.println(detectLoop(head));
	}

}
