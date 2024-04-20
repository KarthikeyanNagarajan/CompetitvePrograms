package com.karthik.practice.LinkedList.Q03_DetectLoop;

public class UsingFloydCycleFindingAlgo
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

	public boolean reverse()
	{
		if (head != null || head.next != null)
			return false;
		Node slow = head;
		Node fast = head;
		while (fast.next != null && fast.next.next != null)
		{
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow)
				return true;
		}
		return false;
	}

	public static void main(String[] args)
	{
		UsingFloydCycleFindingAlgo list = new UsingFloydCycleFindingAlgo();
		for (int i = 5; i >= 1; i--)
		{
			list.pushNode(i);
		}
		boolean flag = list.reverse();
		System.out.println(flag);
	}

}
