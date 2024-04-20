package com.karthik.practice.LinkedList.Q36_SortLLAlreadySortedOnAbsoluteValue;

public class Sort
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

	public Node sort()
	{
		if (head == null || head.next == null)
			return head;
		Node node = head;
		Node next = head;
		Node prev = null;
		if (head.data < 0)
		{
			prev = node;
			node = node.next;
		}
		while(node != null)
		{
			if(node.data < 0)
			{
				prev.next = node.next;
				next = node.next;
				node.next = head;
				head = node;
				node = next;
			}
			else
			{
				prev = node;
				node = node.next;
			}
		}
		return head;
	}

	public static void main(String[] args)
	{
		Sort list = new Sort();
		list.pushNode(12);
		list.pushNode(11);
		list.pushNode(-9);
		list.pushNode(5);
		list.pushNode(3);
		list.pushNode(2);
		list.printNode();
		list.sort();
		list.printNode();
	}

}
