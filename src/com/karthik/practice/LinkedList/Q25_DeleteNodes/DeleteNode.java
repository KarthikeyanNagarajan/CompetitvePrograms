package com.karthik.practice.LinkedList.Q25_DeleteNodes;

public class DeleteNode
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

	public Node findNode(Node temp, int k)
	{
		while (temp != null)
		{
			if (temp.data == k)
				return temp;
			temp = temp.next;
		}
		return null;
	}

	public Node deleteNode(Node head, int k)
	{
		Node temp = findNode(head, k);
		if (temp == null)
			return null;
		temp.data = temp.next.data;
		temp.next = temp.next.next;
		return temp;
	}

	public static void main(String[] args)
	{
		DeleteNode list = new DeleteNode();
		list.pushNode(1);
		list.pushNode(4);
		list.pushNode(5);
		list.pushNode(2);
		list.pushNode(3);

		list.printNode();
		list.deleteNode(head, 4);
		list.printNode();
	}

}
