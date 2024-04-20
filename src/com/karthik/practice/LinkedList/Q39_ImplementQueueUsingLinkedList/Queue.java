package com.karthik.practice.LinkedList.Q39_ImplementQueueUsingLinkedList;

public class Queue
{
	static Node head;
	static Node rear = null;
	static Node front = null;

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

	public void enqueue(int data)
	{
		Node new_Node = new Node(data);
		if (rear == null)
		{
			front = rear = new_Node;
			return;
		}
		rear.next = new_Node;
		rear = new_Node;
	}

	public void dequeue()
	{
		if (front == null)
			return;
		front = front.next;
		if (front == null)
			rear = null;
	}

	public void printNode()
	{
		Node temp = front;
		while (temp != null)
		{
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("Null" + "\n");
	}

	public static void main(String[] args)
	{
		Queue list = new Queue();
		list.enqueue(12);
		list.enqueue(11);
		list.enqueue(9);
		list.enqueue(5);
		list.enqueue(3);
		list.enqueue(2);
		list.printNode();
		list.dequeue();
		list.printNode();
	}

}
