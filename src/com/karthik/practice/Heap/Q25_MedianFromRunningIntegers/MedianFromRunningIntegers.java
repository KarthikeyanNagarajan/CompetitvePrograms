package com.karthik.practice.Heap.Q25_MedianFromRunningIntegers;

import java.util.PriorityQueue;

public class MedianFromRunningIntegers
{
	public static void streamMed(int A[], int N)
	{
		PriorityQueue<Double> g = new PriorityQueue<>();
		PriorityQueue<Double> s = new PriorityQueue<>();
		for (int i = 0; i < N; i++)
		{
			// Negation for treating it as max heap
			s.add(-1.0 * A[i]);
			g.add(-1.0 * s.poll());
			if (g.size() > s.size())
				s.add(-1.0 * g.poll());

			if (g.size() != s.size())
				System.out.println(-1.0 * s.peek());
			else
				System.out.println((g.peek() - s.peek()) / 2);
		}
	}

	public static void main(String[] args)
	{
		int A[] = { 5, 15, 1, 3, 2, 8, 7, 9, 10, 6, 11, 4 };
		int N = A.length;
		streamMed(A, N);
	}
}
