package com.karthik.practice.LinkedList.Q01_FindMiddle;

public class UsingTwoPointer
{
	Node head;

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

	public void pushNode(int data)
	{
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}

	public void printNode()
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("Null" + "\n");
	}

	public void printMiddle()
	{
		Node slow_ptr = head;
		Node fast_ptr = head;
		while (fast_ptr != null && fast_ptr.next != null)
		{
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
		}
		System.out.println(slow_ptr.data);
	}

	public static void main(String[] args)
	{
		UsingTwoPointer list = new UsingTwoPointer();
		for (int i = 5; i >= 1; i--)
		{
			list.pushNode(i);
			list.printNode();
			list.printMiddle();
		}
	}
}
