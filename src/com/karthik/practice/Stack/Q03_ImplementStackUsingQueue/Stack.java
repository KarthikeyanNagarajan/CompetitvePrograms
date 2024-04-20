package com.karthik.practice.Stack.Q03_ImplementStackUsingQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Stack
{

	Queue<Integer> q = new LinkedList<>();

	void push(int data)
	{
		q.add(data);
		for (int i = 0; i < q.size() - 1; i++)
		{
			q.add(q.remove());
		}
	}

	int pop()
	{
		return q.remove();
	}

	int top()
	{
		return q.peek();
	}

	int size()
	{
		return q.size();
	}

	void print()
	{
		q.stream().forEach(i -> System.out.print(i + " "));
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
