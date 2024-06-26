package com.karthik.practice.Heap.Q20_KLargestElementInStream;

import java.util.PriorityQueue;

public class KLargestElementInStream
{
	static int[] kthLargest(int k, int arr[], int n)
	{
		int[] ans = new int[n];

		// Creating a min-heap using priority queue
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);

		// Iterating through each element
		for (int i = 0; i < n; i++)
		{
			// If size of priority queue is less than k
			if (pq.size() < k)
				pq.add(arr[i]);
			else
			{
				if (arr[i] > pq.peek())
				{
					pq.poll();
					pq.add(arr[i]);
				}
			}

			// If size is less than k
			if (pq.size() < k)
				ans[i] = -1;
			else
				ans[i] = pq.peek();
		}

		return ans;
	}

	public static void main(String[] args)
	{
		int n = 6;
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int k = 4;

		int[] v = kthLargest(k, arr, n);
		for (int it : v)
			System.out.print(it + " ");
	}
}
