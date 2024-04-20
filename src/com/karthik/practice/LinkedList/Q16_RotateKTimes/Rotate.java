package com.karthik.practice.LinkedList.Q16_RotateKTimes;

class Node
{
	int data;
	Node next;

	public Node()
	{
	}

	public Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

public class Rotate
{
	static Node head;

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

	public void rotate(Node a, int k)
	{
		if (a == null || a.next == null || k == 0)
			return;
		Node cur = a;
		int len = 1;
		while (cur.next != null)
		{
			len++;
			cur = cur.next;
		}
		cur.next = a;
		k = k % len;
		k = len - k;
		while (k-- > 0)
			cur = cur.next;
		head = cur.next;
		cur.next = null;
	}

	public static void main(String[] args)
	{
		Rotate list = new Rotate();
		list.pushNode(12);
		list.pushNode(11);
		list.pushNode(9);
		list.pushNode(5);
		list.pushNode(3);
		list.pushNode(2);
		list.printNode(head);	
		list.rotate(head, 2);
		list.printNode(head);
	}

}
