package com.karthik.practice.Stack.Q11_NumberOfNextGreaterElement;

import java.util.Arrays;
import java.util.Stack;

public class NumberOfNextGreaterElement2
{
	static void findNext(int next[], int a[], int n)
	{
		Stack<Integer> st = new Stack<>();
		st.push(0);

		for (int i = 1; i < n; i++)
		{
			while (!st.isEmpty())
			{
				int current = st.peek();
				if (a[current] < a[i])
				{
					next[current] = i;
					st.pop();
				}
				else
					break;
			}
			st.push(i);
		}
		
		while (!st.isEmpty())
		{
			int current = st.peek();
			next[current] = -1;
			st.pop();
		}
		Arrays.stream(next).forEach(i -> System.out.print(i + " "));
		System.out.println();
	}

	static void count(int a[], int dp[], int n)
	{
		int[] next = new int[n];
		
		findNext(next, a, n);

		for (int i = n - 2; i >= 0; i--)
		{
			if (next[i] == -1)
				dp[i] = 0;
			else
				dp[i] = 1 + dp[next[i]];
		}
		Arrays.stream(dp).forEach(i -> System.out.print(i + " "));
		System.out.println();
	}

	static int answerQuery(int dp[], int index)
	{
		return dp[index];
	}

	public static void main(String[] args)
	{
		int a[] = { 1, 3, 6, 5, 8, 9, 13, 4 };
		int n = a.length;

		int dp[] = new int[n];

		count(a, dp, n);
		System.out.println(answerQuery(dp, 0));
		System.out.println(answerQuery(dp, 1));
		System.out.println(answerQuery(dp, 5));
	}

}
