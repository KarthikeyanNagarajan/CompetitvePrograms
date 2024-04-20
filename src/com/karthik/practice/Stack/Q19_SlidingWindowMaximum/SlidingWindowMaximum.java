package com.karthik.practice.Stack.Q19_SlidingWindowMaximum;

import java.util.ArrayDeque;
import java.util.Deque;

public class SlidingWindowMaximum
{
	static int[] maxSlidingWindow(int[] arr, int k)
	{
		int n = arr.length;
		int[] r = new int[n - k + 1];
		int ri = 0;
		Deque<Integer> dq = new ArrayDeque<>();
		for (int i = 0; i < n; i++)
		{
			if (!dq.isEmpty() && dq.peek() == i - k)
				dq.poll();
			while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i])
				dq.pollLast();
			dq.offer(i);
			if (i >= k - 1)
				r[ri++] = arr[dq.peek()];
		}
		return r;
	}

	public static void main(String[] args)
	{
		int arr[] = { 4, 0, -1, 3, 5, 3, 6, 8 };
		int k = 3;
		int ans[] = maxSlidingWindow(arr, k);
		System.out.println("Maximum element in every " + k + " window ");
		for (int i = 0; i < ans.length; i++)
			System.out.print(ans[i] + "  ");
	}

}
