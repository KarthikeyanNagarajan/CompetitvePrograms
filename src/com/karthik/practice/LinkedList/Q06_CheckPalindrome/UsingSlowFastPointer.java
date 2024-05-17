package com.karthik.practice.LinkedList.Q06_CheckPalindrome;

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

public class UsingSlowFastPointer
{
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

	public static Node reverse(Node head)
	{
		Node prev = null;
		Node next = null;
		Node current = head;
		while (current != null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

	public static boolean isPalindrome(Node head)
	{
		Node slow = head;
		Node fast = head;
		while (fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}

		slow.next = reverse(slow.next);
		slow = slow.next;

		while (slow != null)
		{
			if (head.data != slow.data)
				return false;
			head = head.next;
			slow = slow.next;
		}
		return true;
	}

	public static void main(String[] args)
	{
		// Create a linked list with
		// values 1, 5, 2, 5, and 1 (15251, a palindrome)
		Node head = new Node(1);
		head.next = new Node(5);
		head.next.next = new Node(2);
		head.next.next.next = new Node(5);
		head.next.next.next.next = new Node(1);

		// Print the original linked list
		System.out.print("Original Linked List: ");
		printNode(head);
		System.out.println();

		// Check if the linked list is a palindrome
		if (isPalindrome(head))
		{
			System.out.println("The linked list is a palindrome.");
		}
		else
		{
			System.out.println("The linked list is not a palindrome.");
		}
	}

}
