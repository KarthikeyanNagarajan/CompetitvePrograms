package com.karthik.practice.LinkedList.Q30_RearrangeInZigZagManner;

public class Rearrange
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

	public Node rearrange(Node head)
	{
		if (head == null || head.next == null)
			return head;
		Node node = head;
		boolean flag = true;
		while (node.next != null)
		{
			if (flag)
			{
				if (node.data > node.next.data)
				{
					int t = node.data;
					node.data = node.next.data;
					node.next.data = t;
				}
				flag = !flag;
			}
			else
			{
				if (node.data < node.next.data)
				{
					int t = node.data;
					node.data = node.next.data;
					node.next.data = t;
				}
				flag = !flag;
			}
			node = node.next;
		}
		return head;
	}

	public static void main(String[] args)
	{
		Rearrange list = new Rearrange();
		list.pushNode(12);
		list.pushNode(11);
		list.pushNode(9);
		list.pushNode(5);
		list.pushNode(3);
		list.pushNode(2);

		list.printNode();
		head = list.rearrange(head);
		list.printNode();
	}

}
