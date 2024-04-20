package com.karthik.practice.LinkedList.Q14_AddTwoNumbers;

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

public class Add
{
	static Node head1;
	static Node head2;

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

	public Node add(Node a, Node b)
	{
		Node dummy = new Node();
		Node temp = dummy;
		int carry = 0;
		while (a != null || b != null || carry == 1)
		{
			int sum = 0;
			if (a != null)
			{
				sum += a.data;
				a = a.next;
			}
			if (b != null)
			{
				sum += b.data;
				b = b.next;
			}
			sum += carry;
			carry = sum / 10;
			Node node = new Node(sum % 10);
			temp.next = node;
			temp = temp.next;
		}
		return dummy.next;
	}

	public static void main(String[] args)
	{
		Add list = new Add();
		list.pushNode1(12);
		list.pushNode1(11);
		list.pushNode1(9);
		list.pushNode2(5);
		list.pushNode2(3);
		list.pushNode2(2);
		list.printNode(head1);
		list.printNode(head2);
		Node res = list.add(head1, head2);
		list.printNode(res);
	}

}
