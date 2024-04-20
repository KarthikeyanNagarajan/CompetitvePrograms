package com.karthik.practice.LinkedList.Q33_InsertingNewElement;

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

public class InsertElement
{
	static Node head;

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

	public void insert(Node newNode)
	{
		Node temp = head;
		int key = newNode.data;
		while (temp.next != null && temp.next.data < key)
			temp = temp.next;
		newNode.next = temp.next;
		temp.next = newNode;
	}

	public static void main(String[] args)
	{
		InsertElement list = new InsertElement();
		list.pushNode(12);
		list.pushNode(11);
		list.pushNode(9);
		list.pushNode(5);
		list.pushNode(3);
		list.pushNode(2);
		list.printNode();

		Node newNode = new Node(4);

		list.insert(newNode);
		list.printNode();
	}

}
