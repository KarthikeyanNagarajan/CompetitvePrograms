package com.karthik.practice.Heap.Q13_SumOfElementsBetweenK1AndK2;

import java.util.Collections;
import java.util.PriorityQueue;

public class SumOfElementsBetweenK1AndK2
{
	public static long sumBetweenTwoKth(long A[], long N, long K1, long K2)
	{
		PriorityQueue<Long> heap = new PriorityQueue<>(Collections.reverseOrder());

		// Eliminate K2 smallest element as they are not required for us
		for (int i = 0; i < N; i++)
		{
			heap.offer(A[i]);
			if (heap.size() > K2)
			{
				heap.poll();
			}
		}
		// Popping out the K2'th smallest element
		heap.poll();

		long ans = 0;
		// Adding the elements to ans until we reach the K1 smallest element
		while (heap.size() > K1)
		{
			ans += heap.peek();
			heap.poll();
		}

		return ans;
	}

	public static void main(String[] args)
	{
		long arr[] = { 20, 8, 22, 4, 12, 10, 14 };
		long k1 = 3, k2 = 6;
		long n = arr.length;
		System.out.println(sumBetweenTwoKth(arr, n, k1, k2));
	}
}
