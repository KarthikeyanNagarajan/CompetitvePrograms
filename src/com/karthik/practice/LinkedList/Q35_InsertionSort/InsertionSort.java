package com.karthik.practice.LinkedList.Q35_InsertionSort;

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

public class InsertionSort
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
	
	public void printNode1(Node node)
	{
		Node temp = node;
		while (temp != null)
		{
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("Null" + "\n");
	}

	public Node sort()
	{
		Node dummy = new Node(10000);
		while (head != null)
		{
			Node next = head.next;
			Node temp = dummy;
			while (temp.next != null && temp.next.data < head.data)
				temp = temp.next;
			head.next = temp.next;
			temp.next = head;
			head = next;
		}
		return dummy.next;
	}

	public static void main(String[] args)
	{
		InsertionSort list = new InsertionSort();
		list.pushNode(12);
		list.pushNode(2);
		list.pushNode(5);
		list.pushNode(3);
		list.pushNode(11);
		list.pushNode(9);
		list.printNode();

		Node ans = list.sort();
		list.printNode1(ans);		
	}

}
