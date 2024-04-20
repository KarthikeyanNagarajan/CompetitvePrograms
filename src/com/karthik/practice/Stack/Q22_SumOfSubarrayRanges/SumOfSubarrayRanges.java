package com.karthik.practice.Stack.Q22_SumOfSubarrayRanges;

import java.util.Stack;

public class SumOfSubarrayRanges
{
	static int subarrayRange(int[] arr, int n)
	{
		int j = 0, k = 0, res = 0;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i <= n; i++)
		{
			while (!st.isEmpty() && arr[st.peek()] > ((i == n) ? Integer.MIN_VALUE : arr[i]))
			{
				j = st.pop();
				k = st.isEmpty() ? -1 : st.peek();
				res -= arr[j] * (i - j) * (j - k);
			}
			st.push(i);
		}

		st.clear();

		for (int i = 0; i <= n; i++)
		{
			while (!st.isEmpty() && arr[st.peek()] < ((i == n) ? Integer.MAX_VALUE : arr[i]))
			{
				j = st.pop();
				k = st.isEmpty() ? -1 : st.peek();
				res += arr[j] * (i - j) * (j - k);
			}
			st.push(i);
		}
		return res;
	}

	public static void main(String[] args)
	{
		int n = 3;
		int[] arr = { 1, 2, 3 };
		System.out.println(subarrayRange(arr, n));
	}

}
