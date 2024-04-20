package com.karthik.practice.Stack.Q13_AsteroidCollision;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision
{
	static int[] asteroidCollision(int[] arr, int n)
	{
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < n; i++)
		{
			if (st.isEmpty() || arr[i] > 0)
			{
				st.push(arr[i]);
				continue;
			}
			while (true)
			{
				int prev = st.peek();
				if (prev < 0)
				{
					st.push(arr[i]);
					break;
				}
				if (prev == -arr[i])
				{
					st.pop();
					break;
				}
				if (prev > -arr[i])
					break;
				st.pop();
				while (st.isEmpty())
				{
					st.push(arr[i]);
					break;
				}
			}
		}
		int[] res = new int[st.size()];
		for (int i = st.size() - 1; i >= 0; i--)
		{
			res[i] = st.pop();
		}
		return res;
	}

	public static void main(String[] args)
	{
		int[] arr = { 3, 5, -3 };
		int n = arr.length;
		int[] res = asteroidCollision(arr, n);
		Arrays.stream(res).forEach(i -> System.out.print(i + " "));
	}

}
