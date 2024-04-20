package com.karthik.practice.LinkedList.Q09_IntersectionPointY;

public class IntersectionPoint
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

	public void printNode1()
	{
		Node temp = head1;
		while (temp != null)
		{
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("Null" + "\n");
	}

	public void printNode2()
	{
		Node temp = head2;
		while (temp != null)
		{
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print("Null" + "\n");
	}

	public static Node intersectionPoint()
	{
		Node a = head1;
		Node b = head2;
		if (head1 == null || head2 == null)
			return null;
		while (a.data != b.data)
		{
			a = a == null ? head2 : a.next;
			b = b == null ? head1 : b.next;
		}
		return a;
	}

	public static void main(String[] args)
	{
		IntersectionPoint list1 = new IntersectionPoint();
		list1.pushNode1(3);
		list1.pushNode1(6);
		list1.pushNode1(9);
		list1.pushNode1(15);
		list1.pushNode1(30);
		IntersectionPoint list2 = new IntersectionPoint();
		list2.pushNode2(2);
		list2.pushNode2(7);
		list2.pushNode2(9);
		list2.pushNode2(13);
		list2.pushNode2(32);

		list1.printNode1();
		list2.printNode2();
		Node temp = intersectionPoint();
		System.out.println(temp.data);
	}

}
