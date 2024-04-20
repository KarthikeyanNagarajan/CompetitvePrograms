package com.karthik.practice.Stack.Q43_InterleaveFirstHalfOfQueueWithSecondHalf;

import java.util.LinkedList;
import java.util.Queue;

public class Interleave
{

	static void interLeave(Queue<Integer> q)
	{
		if (q.size() % 2 != 0)
			System.out.println("Inpu even Nos.");

		Queue<Integer> temp = new LinkedList<>();
		int half = q.size() / 2;
		for (int i = 0; i < half; i++)
		{
			temp.add(q.poll());
		}
		while (!temp.isEmpty())
		{
			q.add(temp.poll());
			q.add(q.poll());			
		}
	}

	public static void main(String[] args)
	{
		Queue<Integer> q = new LinkedList<>();
		q.add(11);
		q.add(12);
		q.add(13);
		q.add(14);
		q.add(15);
		q.add(16);
		q.add(17);
		q.add(18);
		q.add(19);
		q.add(20);
		interLeave(q);
		int length = q.size();
		for (int i = 0; i < length; i++)
		{
			System.out.print(q.peek() + " ");
			q.remove();
		}
	}

}
