package com.karthik.practice.LinkedList.Q43_MoveAllOccurrencesToEnd;

public class Move
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

	public Node move(int value)
	{
		if (head == null || head.next == null)
			return head;
		Node node, prev, tail, next, temp;
		node = head;
		prev = null;
		while (node != null)
			node = node.next;
		tail = node;
		temp = tail;
		node = head;
		while (node != tail)
		{
			if (node.data == value && prev == null)
			{
				next = node.next;
				temp.next = node;
				temp = temp.next;
				node.next = null;
				node = head = next;
			}
			else if (node.data == value && prev != null)
			{
				next = node.next;
				prev.next = node.next;
				temp.next = node;
				temp = temp.next;
				node.next = null;
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
		Move list = new Move();
		list.pushNode(12);
		list.pushNode(11);
		list.pushNode(9);
		list.pushNode(5);
		list.pushNode(3);
		list.pushNode(2);
		list.printNode();
		list.move(12);
		list.printNode();
	}

}
