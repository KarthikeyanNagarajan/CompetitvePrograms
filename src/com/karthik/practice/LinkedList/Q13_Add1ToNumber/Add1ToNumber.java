package com.karthik.practice.LinkedList.Q13_Add1ToNumber;

public class Add1ToNumber
{
	static Node head;

	static class Node
	{
		int data;
		Node next;

		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}

	public static Node newNode(int data)
	{
		Node new_node = new Node(data);
		return new_node;
	}

	public static Node reverse(Node head)
	{
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		return prev;
	}

	public static Node addOneUtil(Node head)
	{
		Node res = head;
		Node temp = null;
		int carry = 1, sum = 0;

		while (head != null) 
		{			
			sum = carry + head.data;
			carry = (sum >= 10) ? 1 : 0;
			sum = sum % 10;
			head.data = sum;
			temp = head;
			head = head.next;
		}
		
		if (carry > 0)
			temp.next = newNode(carry);
		return res;
	}

	public static Node addOne(Node head)
	{
		head = reverse(head); // head 1-> 9
		head = addOneUtil(head); // head 9 -> 0
		return reverse(head);
	}

	static void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

	public static void main(String[] args)
	{
		Node head = newNode(1);
		head.next = newNode(9);
		head.next.next = newNode(9);
		head.next.next.next = newNode(9);

		System.out.print("List is ");
        printList(head);
 
        head = addOne(head);
        System.out.println();
        System.out.print("Resultant list is ");
        printList(head);
	}
}

// This code is contributed by prerna saini
