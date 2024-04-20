package temp.practice;

// Java program to reverse a linked
// list using two pointers.
import java.util.*;

public class practice {

	// Link list node
	static class Node {
		int data;
		Node next;
	};

	static Node head_ref = null;

	// Function to reverse the linked
	// list using 2 pointers
	static void reverse()
	{
		Node next;
		Node curr = head_ref;
		while (curr.next != null) {
			next = curr.next;
			curr.next = next.next;
			next.next = head_ref;
			head_ref = next;
			System.out.println();
			printList();
		}
	}

	// Function to push a node
	static void push(int new_data)
	{

		// Allocate node
		Node new_node = new Node();

		// Put in the data
		new_node.data = new_data;

		// Link the old list of the new node
		new_node.next = (head_ref);

		// Move the head to point to the new node
		(head_ref) = new_node;
	}

	// Function to print linked list
	static void printList()
	{
		Node temp = head_ref;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		push(20);
		push(4);
		push(15);
		push(85);

		System.out.print("Given linked list\n");
		printList();
		reverse();
		System.out.print("\nReversed Linked list \n");
		printList();
	}
}

// This code is contributed by Abhijeet Kumar(abhijeet19403)
