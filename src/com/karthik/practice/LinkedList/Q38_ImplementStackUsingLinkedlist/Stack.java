package com.karthik.practice.LinkedList.Q38_ImplementStackUsingLinkedlist;

public class Stack
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
	
	public void pop()
	{
		head = head.next;
	}
	
	public int peek()
	{
		return head.data;
	}
	
	public static void main(String[] args)
	{
		Stack list = new Stack();
		list.pushNode(12);
		list.pushNode(11);
		list.pushNode(9);
		list.pushNode(5);
		list.pushNode(3);
		list.pushNode(2);
		list.printNode();
		System.out.println(list.peek());
		list.pop();
		list.printNode();
	}

}
