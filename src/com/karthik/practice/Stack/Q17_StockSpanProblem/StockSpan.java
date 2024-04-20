package com.karthik.practice.Stack.Q17_StockSpanProblem;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan
{
	static int[] stockSpan(int[] arr, int n)
	{
		int[] s = new int[n];
		Stack<Integer> st = new Stack<>();
		st.push(0);
		s[0] = 1;
		for (int i = 0; i < n; i++)
		{
			while (!st.isEmpty() && arr[st.peek()] <= arr[i])
				st.pop();
			s[i] = st.isEmpty() ? (i + 1) : i - st.peek();
			st.push(i);
		}
		return s;
	}

	public static void main(String[] args)
	{
		int[] arr = { 100, 80, 60, 70, 60, 75, 85 };
		int n = arr.length;
		int[] res = stockSpan(arr, n);
		Arrays.stream(res).forEach(i -> System.out.print(i + " "));
	}

}
