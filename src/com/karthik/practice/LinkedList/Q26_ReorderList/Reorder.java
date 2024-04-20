package com.karthik.practice.LinkedList.Q26_ReorderList;

public class Reorder
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

	public Node reverse(Node head)
	{
		Node prev = null;
		Node next = null;
		Node current = head;
		while (current != null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

	public Node findMiddle(Node head)
	{
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public Node reorder(Node head)
	{
		Node middle = findMiddle(head);
		Node first = head;
		Node second = reverse(middle.next);
		middle.next = null;
		while (second != null)
		{
			Node temp1 = first.next;
			Node temp2 = second.next;
			first.next = second;
			second.next = temp1;
			first = temp1;
			second = temp2;			
		}
		return middle;
	}

	public static void main(String[] args)
	{
		Reorder list = new Reorder();
		list.pushNode(1);
		list.pushNode(4);
		list.pushNode(5);
		list.pushNode(2);
		list.pushNode(3);

		list.printNode();
		list.reorder(head);
		list.printNode();
	}

}
