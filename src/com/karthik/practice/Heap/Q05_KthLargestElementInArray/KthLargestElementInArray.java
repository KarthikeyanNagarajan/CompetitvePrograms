package com.karthik.practice.Heap.Q05_KthLargestElementInArray;

import java.util.PriorityQueue;

public class KthLargestElementInArray
{
	public static int kthLargest(int[] arr, int N, int K)
	{
		// Create a min heap (priority queue)
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < N; i++)
		{
			pq.offer(arr[i]);

			// Removes head element
			if (pq.size() > K)
				pq.poll();
			System.out.println(pq);
		}

		// Return top of the max heap
		return pq.peek();
	}

	public static void main(String[] args)
	{
		int N = 6;
		int arr[] = {1, 2, 6, 4, 5, 3};
		int K = 3;

		System.out.println("Kth Largest Element is: " + kthLargest(arr, N, K));
	}
}
