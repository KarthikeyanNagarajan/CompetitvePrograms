package com.karthik.practice.LinkedList.Q42_DeleteMiddleNode;

public class DeleteMiddleNode
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

	public void delete()
	{
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		if(slow.next == null)
		{
			head.next = null;
			return;
		}
		slow.data = slow.next.data;
		slow.next = slow.next.next;
	}

	public static void main(String[] args)
	{
		DeleteMiddleNode list = new DeleteMiddleNode();
		list.pushNode(12);
		list.pushNode(11);
		list.pushNode(9);
		list.pushNode(5);
		list.pushNode(3);
		list.pushNode(2);
		list.printNode();
		list.delete();
		list.printNode();
	}

}
