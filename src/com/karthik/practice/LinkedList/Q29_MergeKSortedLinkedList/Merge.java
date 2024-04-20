package com.karthik.practice.LinkedList.Q29_MergeKSortedLinkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

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

class NodeComparator implements Comparator<Node>
{
	public int compare(Node a, Node b)
	{
		if (a.data > b.data)
			return 1;
		else if (a.data < b.data)
			return -1;
		return 0;
	}
}

public class Merge
{
	static Node head;

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

	public static Node mergeKList(Node[] head, int n)
	{
		PriorityQueue<Node> queue = new PriorityQueue<>(new NodeComparator());
		Node dummy = new Node(-1);
		Node tail = dummy;
		for (int i = 0; i < n; i++)
		{
			if (head[i] != null)
				queue.add(head[i]);
		}
		while (queue.size() > 0)
		{
			Node temp = queue.poll();
			tail.next = temp;
			tail = temp;
			if(temp.next != null)
				queue.add(temp.next);
		}
		return dummy.next;
	}

	public static void main(String[] args)
	{
		int N = 3;

		// array to store head of linkedlist
		Node[] a = new Node[N];

		// Linkedlist1
		Node head1 = new Node(1);
		a[0] = head1;
		head1.next = new Node(3);
		head1.next.next = new Node(5);
		head1.next.next.next = new Node(7);

		// Limkedlist2
		Node head2 = new Node(2);
		a[1] = head2;
		head2.next = new Node(4);
		head2.next.next = new Node(6);
		head2.next.next.next = new Node(8);

		// Linkedlist3
		Node head3 = new Node(0);
		a[2] = head3;
		head3.next = new Node(9);
		head3.next.next = new Node(10);
		head3.next.next.next = new Node(11);

		Node res = mergeKList(a, N);

		if (res != null)
			printNode(res);
	}

}
