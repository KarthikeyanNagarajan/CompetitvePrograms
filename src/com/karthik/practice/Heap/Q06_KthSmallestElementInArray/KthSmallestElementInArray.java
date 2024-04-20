package com.karthik.practice.Heap.Q06_KthSmallestElementInArray;

import java.util.PriorityQueue;

public class KthSmallestElementInArray
{
	public static int kthSmallest(int[] arr, int N, int K)
	{
		// Create a max heap (priority queue)
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

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

		System.out.println("Kth Smallest Element is: " + kthSmallest(arr, N, K));
	}
}
