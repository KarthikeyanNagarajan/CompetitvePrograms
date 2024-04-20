package com.karthik.practice.LinkedList.Q34_BinarySearch;

public class BinarySearch
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
	
	public Node getMiddle(Node start, Node last)
	{
		Node slow = start;
		Node fast = start.next;
		while (fast != null && fast.next != null && fast != last)
		{
			slow = slow.next;
			fast = fast.next.next;			
		}
		return slow;
	}

	public Node search(int key)
	{
		Node start = head;
		Node last = null;
		while(start != last)
		{
			Node mid = getMiddle(start, last);
			if(mid == null)
				return null;
			if(mid.data == key)
				return mid;
			else if (mid.data < key)
				start = mid.next;
			else
				last = mid;
		}	
		return null;
	}

	public static void main(String[] args)
	{
		BinarySearch list = new BinarySearch();
		list.pushNode(12);
		list.pushNode(11);
		list.pushNode(9);
		list.pushNode(5);
		list.pushNode(3);
		list.pushNode(2);
		list.printNode();
		int key = 5;
		Node ans = list.search(key);
		if(ans != null)
			System.out.println(ans.data);
		else
			System.out.println(0);
	}

}
