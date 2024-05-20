package com.karthik.practice.LinkedList.Q41_CheckIfLinkedListIsSorted;

public class IsSorted
{
	static Node head;

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

	public boolean isSorted()
	{
		int x = head.data;

		Node temp = head;
		while (temp != null)
		{
			if (temp.data < x)
				return false;
			x = temp.data;
			temp = temp.next;
		}
		return true;
	}

	public static void main(String[] args)
	{
		IsSorted list = new IsSorted();
		list.pushNode(12);
		list.pushNode(11);
		list.pushNode(1);
		list.pushNode(5);
		list.pushNode(3);
		list.pushNode(2);
		list.printNode();
		System.out.println(list.isSorted());
	}

}
