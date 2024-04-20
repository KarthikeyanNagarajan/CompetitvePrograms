package com.karthik.practice.LinkedList.Q28_LinkedListCycle;

public class Cycle
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

	public boolean findMiddle(Node head)
	{
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow)
				return true;
		}
		return false;
	}	

	public static void main(String[] args)
	{
		Cycle list = new Cycle();
		list.pushNode(1);
		list.pushNode(4);
		list.pushNode(5);
		list.pushNode(2);
		list.pushNode(3);

		list.printNode();
		System.out.println(list.findMiddle(head));
	}

}
