package com.karthik.practice.LinkedList.Q07_DeleteMiddleNode;

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

	public Node middle()
	{
		if (head == null || head.next == null)
			return null;
		Node slow = head;
		Node fast = head;
		Node prev = null;
		while (fast != null && fast.next != null)
		{
			fast = fast.next.next;
			prev = slow;
			slow = slow.next;
		}
		prev.next = slow.next;
		return slow;
	}

	public static void main(String[] args)
	{
		UsingSlowFastPointer list = new UsingSlowFastPointer();
		for (int i = 5; i >= 1; i--)
		{
			list.pushNode(i);
		}
		list.printNode();
		Node flag = list.middle();
		System.out.println("Deleted Value -> " + flag.data);
		list.printNode();
	}

}
