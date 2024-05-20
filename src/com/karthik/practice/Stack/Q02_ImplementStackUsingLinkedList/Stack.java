package com.karthik.practice.Stack.Q02_ImplementStackUsingLinkedList;

class Node
{
	int data;
	Node next;

	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

public class Stack
{
	Node top = null;
	int size = 0;

	void push(int data)
	{
		Node element = new Node(data);
		element.next = top;
		top = element;
		size++;
	}

	int pop()
	{
		int data = top.data;
		top = top.next;
		size--;
		return data;
	}

	int top()
	{
		return top.data;
	}

	int size()
	{
		return size;
	}

	void print()
	{
		Node element = top;
		while (element != null)
		{
			System.out.print(element.data + " ");
			element = element.next;
		}
		System.out.println();
	}

	public static void main(String[] args)
	{
		Stack st = new Stack();
		st.push(5);
		st.push(3);
		st.push(7);
		st.push(1);
		st.print();
		System.out.println("Pop : " + st.pop());
		st.print();
		System.out.println("Top : " + st.top());
		System.out.println("Size : " + st.size());
	}

}
