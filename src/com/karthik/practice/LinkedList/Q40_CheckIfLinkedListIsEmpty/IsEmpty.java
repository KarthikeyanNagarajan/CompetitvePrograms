package com.karthik.practice.LinkedList.Q40_CheckIfLinkedListIsEmpty;

public class IsEmpty
{
	Node head;

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

	public boolean isEmpty()
	{
		if (head == null)
			return true;
		return false;
	}

	public static void main(String[] args)
	{
		IsEmpty list = new IsEmpty();
		System.out.println(list.isEmpty());
	}

}
