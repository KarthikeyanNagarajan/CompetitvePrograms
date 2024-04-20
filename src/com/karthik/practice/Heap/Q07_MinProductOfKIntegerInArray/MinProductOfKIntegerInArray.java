package com.karthik.practice.Heap.Q07_MinProductOfKIntegerInArray;

import java.util.PriorityQueue;

public class MinProductOfKIntegerInArray
{
	public static int minProduct(int[] arr, int n, int k)
	{
		// Create a min heap (priority queue)
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int i = 0; i < n; i++)
			pq.offer(arr[i]);
		
		System.out.println(pq);

		int count = 0;
		long ans = 1;

		while (!pq.isEmpty() && count < k)
		{
			ans = ans * pq.peek() % 1000000007;
			pq.poll();
			count++;
		}

		return (int) ans;
	}

	// Driver Code
	public static void main(String[] args)
	{
		int arr[] = { 198, 76, 544, 123, 154, 675 };
		int k = 2;
		int n = arr.length;
		System.out.print("Minimum product -> " + minProduct(arr, n, k));
	}
}
