package com.karthik.practice.Stack.Q15_AreaOfLargestRectangleInHistogram;

import java.util.Stack;

public class Method2
{
	static int hist(int[] arr, int n)
	{
		Stack<Integer> st = new Stack<>();
		int[] leftsmall = new int[n];
		int[] rightsmall = new int[n];
		for (int i = 0; i < n; i++)
		{
			while (!st.isEmpty() && arr[st.peek()] >= arr[i])
				st.pop();
			if (st.isEmpty())
				leftsmall[i] = 0;
			else
				rightsmall[i] = st.peek() + 1;
			st.push(i);
		}
		for (int i = n - 1; i >= 0; i--)
		{
			while (!st.isEmpty() && arr[st.peek()] >= arr[i])
				st.pop();
			if (st.isEmpty())
				leftsmall[i] = n - 1;
			else
				rightsmall[i] = st.peek() - 1;
			st.push(i);
		}
		int maxArea = 0;
		for (int i = 0; i < n; i++)
		{
			maxArea = Math.max(maxArea, arr[i] * (rightsmall[i] - leftsmall[i] + 1));
		}
		return maxArea;
	}

	public static void main(String[] args)
	{
		int arr[] = { 6, 2, 5, 4, 5, 1, 6 };
		int n = 7;
		System.out.println(hist(arr, n));
	}

}
