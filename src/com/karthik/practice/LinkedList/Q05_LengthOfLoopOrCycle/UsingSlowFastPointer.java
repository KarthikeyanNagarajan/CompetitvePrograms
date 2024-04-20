package com.karthik.practice.LinkedList.Q05_LengthOfLoopOrCycle;

public class UsingSlowFastPointer
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

	public void printNode(Node head)
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("Null" + "\n");
	}

	public int countNodes(Node n)
	{
		Node temp = n;
		int res = 1;
		while (temp.next != n)
		{
			res++;
			temp = temp.next;
		}
		return res;
	}

	public int length()
	{
		if (head != null && head.next != null)
			return 0;
		Node slow = head;
		Node fast = head;
		while (slow != null && fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
			{
				return countNodes(slow);
			}
		}
		return 0;
	}

	public static void main(String[] args)
	{
		UsingSlowFastPointer list = new UsingSlowFastPointer();
		for (int i = 5; i >= 1; i--)
		{
			list.pushNode(i);
		}
		int flag = list.length();
		System.out.println(flag);
	}

}
