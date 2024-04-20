package com.karthik.practice.LinkedList.Q10_SegregateOddEvenNodes;

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

public class SegregateOddEvenNodes
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

	public void segregateEvenOdd()
	{
		Node evenStart = null;
		Node evenEnd = null;
		Node oddStart = null;
		Node oddEnd = null;
		Node currentNode = head;
		while (currentNode != null)
		{
			int element = currentNode.data;
			if (element % 2 == 0)
			{
				if(evenStart == null)
				{
					evenStart = currentNode;
					evenEnd = evenStart;
				}
				else
				{
					evenEnd.next = currentNode;
					evenEnd = evenEnd.next;
				}
			}
			else
			{
				if(oddStart == null)
				{
					oddStart = currentNode;
					oddEnd = oddStart;
				}
				else
				{
					oddEnd.next = currentNode;
					oddEnd = oddEnd.next;
				}
			}
			currentNode = currentNode.next;
		}
		if(oddStart == null || evenStart == null)
			return;
		evenEnd.next = oddStart;
		oddEnd.next = null;
		head = evenStart;
	}

	public static void main(String[] args)
	{
		SegregateOddEvenNodes list = new SegregateOddEvenNodes();
		list.pushNode(12);
		list.pushNode(11);
		list.pushNode(9);
		list.pushNode(5);
		list.pushNode(3);
		list.pushNode(2);
		list.printNode(head);
		list.segregateEvenOdd();
		list.printNode(head);
	}
}
