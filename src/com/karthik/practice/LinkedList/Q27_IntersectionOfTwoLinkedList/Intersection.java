package com.karthik.practice.LinkedList.Q27_IntersectionOfTwoLinkedList;

public class Intersection
{
	static Node head1;
	static Node head2;

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

	public void pushNode1(int data)
	{
		Node new_node = new Node(data);
		new_node.next = head1;
		head1 = new_node;
	}

	public void pushNode2(int data)
	{
		Node new_node = new Node(data);
		new_node.next = head2;
		head2 = new_node;
	}

	public static void printNode(Node head)
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("Null" + "\n");
	}

	public static int intersect(Node head1, Node head2)
	{
		Node a = head1;
		Node b = head2;
		while (a.data != b.data)
		{
			if (a == null)
				a = head2;
			else
				a = a.next;

			if (b == null)
				b = head1;
			else
				b = b.next;
		}
		return a.data;
	}

	public static void main(String[] args)
	{
		Intersection list1 = new Intersection();
		list1.pushNode1(3);
		list1.pushNode1(2);
		list1.pushNode1(5);
		list1.pushNode1(4);
		list1.pushNode1(1);

		Intersection list2 = new Intersection();
		list2.pushNode2(3);
		list2.pushNode2(2);		
		list2.pushNode2(5);
		list2.pushNode2(45);
		list2.pushNode2(10);
		
		printNode(head1);
		printNode(head2);
		System.out.println(intersect(head1, head2));
	}

}
