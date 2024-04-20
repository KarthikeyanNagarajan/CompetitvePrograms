package com.karthik.practice.LinkedList.Q04_StartingPoint;

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

	public Node startingPoint()
	{
		if (head != null && head.next != null)
			return null;
		Node slow = head;
		Node fast = head;
		Node entry = head;
		while (fast.next != null && fast.next.next != null)
		{
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow)
			{
				while (slow != entry)
				{
					slow = slow.next;
					entry = entry.next;
				}
				return entry;
			}
		}
		return null;
	}

	public static void main(String[] args)
	{
		UsingSlowFastPointer list = new UsingSlowFastPointer();
		for (int i = 5; i >= 1; i--)
		{
			list.pushNode(i);
		}
		Node flag = list.startingPoint();
		if (flag != null)
			System.out.println(flag.data);
		else
			System.out.println(flag);
	}

}
