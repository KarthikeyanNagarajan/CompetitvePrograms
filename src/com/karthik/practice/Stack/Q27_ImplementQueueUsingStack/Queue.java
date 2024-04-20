package com.karthik.practice.Stack.Q27_ImplementQueueUsingStack;

import java.util.Stack;

public class Queue
{
	Stack<Integer> input = new Stack<>();
	Stack<Integer> output = new Stack<>();

	public Queue()
	{

	}

	void push(int val)
	{
		while (!input.isEmpty())
		{
			output.push(input.peek());
			input.pop();
		}
		input.push(val);
		while (!output.isEmpty())
		{
			input.push(output.peek());
			output.pop();
		}
	}

	int pop()
	{
		int val = input.peek();
		input.pop();
		return val;
	}

	int peek()
	{
		return input.peek();
	}

	int size()
	{
		return input.size();
	}

	public static void main(String[] args)
	{
		Queue q = new Queue();
		q.push(3);
		q.push(4);
		System.out.println("The element poped is " + q.pop());
		q.push(5);
		System.out.println("The top element is " + q.peek());
		System.out.println("The size of the queue is " + q.size());
	}

}
