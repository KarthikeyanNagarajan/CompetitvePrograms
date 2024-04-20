package com.karthik.practice.Stack.Q42_ReverseFirstKElementsInQueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseFirstKElements
{
	static void reverseFirstK(Queue<Integer> q, int k)
	{
		Deque<Integer> dq = new ArrayDeque<>();
		for (int i = 0; i < k; i++)
		{
			dq.push(q.poll());
		}
		for (int i = 0; i < k; i++)
		{
			q.add(dq.pop());
		}
		for (int i = 0; i < q.size() - k; i++)
		{
			q.add(q.poll());
		}

	}

	public static void main(String[] args)
	{
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.add(70);
		q.add(80);
		q.add(90);
		q.add(100);

		int k = 5;
		reverseFirstK(q, k);

		while (!q.isEmpty())
		{
			System.out.print(q.peek() + " ");
			q.poll();
		}
	}

}
