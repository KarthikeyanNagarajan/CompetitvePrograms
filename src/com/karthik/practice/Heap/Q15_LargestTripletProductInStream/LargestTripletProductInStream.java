package com.karthik.practice.Heap.Q15_LargestTripletProductInStream;

import java.util.Collections;
import java.util.PriorityQueue;

public class LargestTripletProductInStream
{
	public static void LargestTripletMultiplication(int arr[], int n)
	{
		PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < n; i++)
		{
			heap.add(arr[i]);

			// if less than three elements are present in array print -1
			if (heap.size() < 3)
				System.out.println("-1");
			else
			{
				// pop three largest elements
				int x = heap.poll();
				int y = heap.poll();
				int z = heap.poll();

				// Reinsert x, y, z in priority_queue
				int ans = x * y * z;
				System.out.println(ans);
				heap.add(x);
				heap.add(y);
				heap.add(z);
			}
		}
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		LargestTripletMultiplication(arr, n);
	}
}
