package com.karthik.practice.LinkedList.Q24_DeleteNodesWithGreaterValueOnRightSide;

public class DeleteNodes
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

	public Node reverse(Node head)
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
		head = prev;
		return head;
	}

	public Node deleteNode(Node head)
	{
		head = reverse(head);

		Node cur = head;
		Node prev = head;
		int max = cur.data;

		cur = cur.next;
		while (cur != null)
		{
			if (cur != null)
				System.out.println("cur : " + cur.data + " -  prev :" + prev.data + " -  max :" + max);
			if (cur.data > max)
			{
				max = cur.data;
				prev = cur;
				cur = cur.next;
			}
			else
			{
				prev.next = cur.next;
				cur = prev.next;
			}
		}

		head = reverse(head);
		return head;
	}

	public static void main(String[] args)
	{
		DeleteNodes list = new DeleteNodes();
		list.pushNode(1);
		list.pushNode(4);
		list.pushNode(3);
		list.pushNode(1);
		list.pushNode(9);

		list.printNode();
		head = list.deleteNode(head);
		list.printNode();
	}

}
