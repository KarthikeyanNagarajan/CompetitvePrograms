package com.karthik.practice.Stack.Q32_StackOperationOnMiddleElement;

public class Stack
{
	class DLLNode
	{
		DLLNode prev;
		int data;
		DLLNode next;

		DLLNode(int data)
		{
			this.data = data;
		}
	}

	DLLNode head;
	DLLNode mid;
	DLLNode prev;
	DLLNode next;
	int size;

	int findMiddle()
	{
		if (size == 0)
		{
			System.out.println("Empty");
			return -1;
		}
		return mid.data;
	}

	void push(int data)
	{
		DLLNode new_node = new DLLNode(data);
		if (size == 0)
		{
			head = new_node;
			mid = new_node;
			size++;
			return;
		}
		head.next = new_node;
		new_node.prev = head;
		head = head.next;
		if (size % 2 != 0)
			mid = mid.next;
		size++;
	}

	int pop()
	{
		int data = -1;
		if (size == 0)
		{
			System.out.println("Empty");
		}
		else
		{
			if (size == 1)
			{
				head = null;
				mid = null;
			}
			else
			{
				data = head.data;
				head = head.prev;
				if (size % 2 == 0)
					mid = mid.prev;
			}
			size--;
		}
		return data;
	}

	int deleteMiddleElement()
	{
		int data = -1;
		if (size == 0)
		{
			System.out.println("Empty");
		}
		else
		{
			if (size == 1)
			{
				head = null;
				mid = null;
			}
			else if (size == 2)
			{
				head = head.prev;
				mid = mid.prev;
			}
			else
			{
				mid.next.prev = mid.prev;
				mid.prev.next = mid.next;
				if (size % 2 == 0)
					mid = mid.prev;
				else
					mid = mid.next;
			}
			size--;
		}
		return data;
	}

	public static void main(String[] args)
	{
		Stack ms = new Stack();
		ms.push(11);
		ms.push(22);
		ms.push(33);
		ms.push(44);
		ms.push(55);
		ms.push(66);
		ms.push(77);
		ms.push(88);
		ms.push(99);

		System.out.println("Popped : " + ms.pop());
		System.out.println("Popped : " + ms.pop());
		System.out.println("Middle Element : " + ms.findMiddle());
		ms.deleteMiddleElement();
		System.out.println("New Middle Element : " + ms.findMiddle());
	}

}
