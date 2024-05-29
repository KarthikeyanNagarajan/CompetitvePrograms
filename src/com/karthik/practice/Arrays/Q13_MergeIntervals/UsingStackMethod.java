package com.karthik.practice.Arrays.Q13_MergeIntervals;

import java.util.Stack;

public class UsingStackMethod
{
	static class Pair
	{
		int first, second;

		Pair(int first, int second)
		{
			this.first = first;
			this.second = second;
		}
	}

	public static void UsingStack(Pair[] arr, int n)
	{
		Stack<Pair> st = new Stack<>();
		st.push(arr[0]);
		for (int i = 1; i < n; i++)
		{
			Pair top = st.peek();
			if (top.second > arr[i].first)
			{
				top.second = arr[i].second;
				st.pop();
				st.push(top);
			}
			else
			{
				st.push(arr[i]);
			}
		}
		st.stream().forEach(i -> System.out.println(i.first + "," + i.second));
	}

	public static void main(String[] args)
	{
		Pair arr[] = new Pair[3];
		arr[0] = new Pair(1, 3);
		arr[1] = new Pair(2, 4);
		arr[2] = new Pair(5, 8);
		UsingStack(arr, arr.length);
	}

}
