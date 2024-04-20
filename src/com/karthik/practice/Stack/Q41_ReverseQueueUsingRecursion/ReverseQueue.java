package com.karthik.practice.Stack.Q41_ReverseQueueUsingRecursion;

import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue
{
	static Queue<Integer> queue;

	static void Print()
	{
		while (!queue.isEmpty())
		{
			System.out.print(queue.peek() + " ");
			queue.remove();
		}
	}

	static Queue<Integer> reverseQueue(Queue<Integer> q)
	{
		if (q.isEmpty())
			return q;
		int x = q.poll();
		q = reverseQueue(q);
		q.add(x);
		return q;
	}

	public static void main(String[] args)
	{
		queue = new LinkedList<Integer>();
		queue.add(56);
		queue.add(27);
		queue.add(30);
		queue.add(45);
		queue.add(85);
		queue.add(92);
		queue.add(58);
		queue.add(80);
		queue.add(90);
		queue.add(100);
		queue = reverseQueue(queue);
		Print();
	}

}
