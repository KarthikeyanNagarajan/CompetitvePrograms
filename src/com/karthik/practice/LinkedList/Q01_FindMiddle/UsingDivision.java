package com.karthik.practice.LinkedList.Q01_FindMiddle;

import java.util.stream.Stream;

public class UsingDivision
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

	public int getLen()
	{
		int length = 0;
		Node temp = head;
		while (temp != null)
		{
			length++;
			temp = temp.next;
		}
		return length;
	}

	public void printMiddle()
	{
		if (head != null)
		{
			int length = getLen();
			Node temp = head;
			int midlength = length / 2;
			while (midlength != 0)
			{
				temp = temp.next;
				midlength--;
			}
			System.out.println(temp.data);
		}
	}

	public static void main(String[] args)
	{
		UsingDivision list = new UsingDivision();
		for (int i = 5; i >= 1; i--)
		{
			list.pushNode(i);			
		}
		list.printNode();
		list.printMiddle();
	}

}
