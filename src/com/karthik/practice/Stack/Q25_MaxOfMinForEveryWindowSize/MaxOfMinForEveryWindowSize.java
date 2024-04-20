package com.karthik.practice.Stack.Q25_MaxOfMinForEveryWindowSize;

import java.util.Stack;

public class MaxOfMinForEveryWindowSize
{
	static void print(int[] arr, int n)
	{
		int[] left = new int[n + 1];
		int[] right = new int[n + 1];
		int[] ans = new int[n + 1];
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < n; i++)
		{
			left[i] = -1;
			right[i] = n;
			ans[i] = 0;
		}
		for (int i = 0; i < n; i++)
		{
			while (!st.isEmpty() && arr[st.peek()] >= arr[i])
				st.pop();
			if (!st.isEmpty())
				left[i] = st.peek();
			st.push(i);
		}
		while (!st.isEmpty())
			st.pop();
		for (int i = n - 1; i >= 0; i--)
		{
			while (!st.isEmpty() && arr[st.peek()] >= arr[i])
				st.pop();
			if (!st.isEmpty())
				right[i] = st.peek();
			st.push(i);
		}
		for (int i = 0; i < n; i++)
		{
			int len = right[i] - left[i] - 1;
			ans[len] = Math.max(ans[len], arr[i]);
		}
		for (int i = n - 1; i >= 1; i--)
		{
			ans[i] = Math.max(ans[i], arr[i + 1]);
		}
		for (int i = 1; i <= n; i++)
		{
			System.out.print(ans[i] + " ");
		}
	}

	public static void main(String[] args)
	{
		int arr[] = { 10, 20, 30, 50, 10, 70, 30 };
		int n = arr.length;
		print(arr, n);
	}

}
