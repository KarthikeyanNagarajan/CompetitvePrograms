package com.karthik.practice.LinkedList.Q03_DetectLoop;

import java.util.HashSet;
import java.util.Set;

public class UsingHashing
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
		Set<Node> hs = new HashSet<>();
		while(head != null)
		{
			if(hs.contains(head))
				return true;
			else
			{
				hs.add(head);
				head = head.next;
			}
		}
		return false;
	}

	public static void main(String[] args)
	{
		UsingHashing list = new UsingHashing();
		for (int i = 5; i >= 1; i--)
		{
			list.pushNode(i);
		}
		boolean flag = list.reverse();
		System.out.println(flag);
	}

}
