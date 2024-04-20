package com.karthik.practice.Heap.Q23_MaxSumAtmost2NonOverlapping;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaxSumAtmost2NonOverlapping
{
	public static int maxTwoNonOverLapping(int[][] interval)
	{
		// Sorting the given array on the basis of startTime
		Arrays.sort(interval, (a, b) -> (a[0] == b[0]) ? a[1] - b[1] : a[0] - b[0]);

		// Initializing Priority Queue which stores endTime and value and sort on the
		// basis of endTime
		PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

		// Initializing max and ans variables
		int max = 0;
		int ans = 0;

		// Traversing the given array
		for (int[] e : interval)
		{
			while (!pq.isEmpty())
			{
				// If endTime from priority queue is greater than startTime of
				// traversing interval then break the loop
				if (pq.peek()[0] >= e[0])
					break;
				int[] qu = pq.remove();
				max = Math.max(max, qu[1]);
			}

			ans = Math.max(ans, max + e[2]);
			pq.add(new int[] { e[1], e[2] });
		}

		// Returning ans
		return ans;
	}

	public static void main(String[] args)
	{
		int[][] interval = { { 1, 3, 2 }, { 4, 5, 2 }, { 1, 5, 5 } };
		int maxValue = maxTwoNonOverLapping(interval);
		System.out.println(maxValue);
	}
}
