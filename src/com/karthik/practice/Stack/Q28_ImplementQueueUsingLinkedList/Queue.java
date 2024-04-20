package com.karthik.practice.Stack.Q28_ImplementQueueUsingLinkedList;

public class Queue
{
	class Node
	{
		int data;
		Node next;

		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}

	Node front = null, rear = null;
	int size = 0;

	boolean isEmpty()
	{
		return front == null;
	}

	int peek()
	{
		if (isEmpty())
		{
			System.out.println("Empty");
			return -1;
		}
		return front.data;
	}

	void enqueue(int data)
	{
		Node temp = new Node(data);
		if (isEmpty())
		{
			front = temp;
			rear = temp;
		}
		else
		{
			rear.next = temp;
			rear = temp;
		}
		size++;
	}

	int dequeue()
	{
		if (isEmpty())
		{
			System.out.println("Empty");
			return -1;
		}
		int temp = front.data;
		front = front.next;
		size--;
		return temp;
	}

	int size()
	{
		return size;
	}

	public static void main(String[] args)
	{
		Queue Q = new Queue();
		Q.enqueue(10);
		Q.enqueue(20);
		Q.enqueue(30);
		Q.enqueue(40);
		Q.enqueue(50);
		System.out.println("Dequeued element is " + Q.dequeue());
		System.out.println("The size of the Queue is " + Q.size());
		System.out.println("The Peek element of the Queue is " + Q.peek());
	}

}
