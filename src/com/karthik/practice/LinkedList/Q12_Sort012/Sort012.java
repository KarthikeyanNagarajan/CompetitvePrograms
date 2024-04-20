package com.karthik.practice.LinkedList.Q12_Sort012;

public class Sort012
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

	public Node sort()
	{
		int[] count = new int[3];
		Node ptr = head;
		while (ptr != null)
		{
			count[ptr.data]++;
			ptr = ptr.next;
		}
		ptr = head;
		int i = 0;
		while (ptr != null)
		{
			if (count[i] == 0)
				i++;
			else
			{
				ptr.data = i;
				--count[i];
				ptr = ptr.next;
			}
		}
		return ptr;
	}

	public static void main(String[] args)
	{
		Sort012 list = new Sort012();
		list.pushNode(2);
		list.pushNode(0);
		list.pushNode(1);
		list.pushNode(1);
		list.pushNode(2);
		list.pushNode(0);
		list.printNode();
		Node flag = list.sort();
		list.printNode();
	}

}
