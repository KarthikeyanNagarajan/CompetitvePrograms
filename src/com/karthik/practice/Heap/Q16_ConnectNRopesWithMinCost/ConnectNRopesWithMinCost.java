package com.karthik.practice.Heap.Q16_ConnectNRopesWithMinCost;

import java.util.PriorityQueue;

public class ConnectNRopesWithMinCost
{
	public static int minCost(int arr[], int n)
	{
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
		for (int i = 0; i < n; i++)
		{
			heap.add(arr[i]);
		}

		int res = 0;

		// While size of heap is more than 1
		while (heap.size() > 1)
		{
			int first = heap.poll();
			int second = heap.poll();

			// Connect the ropes: update result and insert the new rope to pq
			res += first + second;
			heap.add(first + second);
		}

		return res;
	}

	public static void main(String args[])
	{
		int len[] = { 4, 3, 2, 6 };
		int size = len.length;
		System.out.println("Total cost for connecting" + " ropes is " + minCost(len, size));
	}
}
