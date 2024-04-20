package com.karthik.practice.LinkedList.Q06_CheckPalindrome;

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

	public Node reverse(Node n)
	{
		Node prev = null;
		Node next = null;
		Node current = n;
		while (current != null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		n = prev;
		return n;
	}

	public boolean length()
	{
		if (head == null || head.next == null)
			return true;
		Node slow = head;
		Node fast = head;
		while (fast.next != null && fast.next.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			slow.next = reverse(slow.next);
			slow = slow.next;
			while (slow != null)
			{
				if (head.data != slow.data)
					return false;
				head = head.next;
				slow = slow.next;
			}
			return true;
		}
		return false;
	}

	public static void main(String[] args)
	{
		UsingSlowFastPointer list = new UsingSlowFastPointer();
		for (int i = 5; i >= 1; i--)
		{
			list.pushNode(i);
		}
		boolean flag = list.length();
		System.out.println(flag);
	}

}
