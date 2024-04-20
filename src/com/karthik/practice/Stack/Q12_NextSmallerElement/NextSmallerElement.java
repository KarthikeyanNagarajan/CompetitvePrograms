package com.karthik.practice.Stack.Q12_NextSmallerElement;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Stack;

public class NextSmallerElement
{
	static void find(int[] arr)
	{
		int n = arr.length;
		Stack<Integer> st = new Stack<>();
		Map<Integer, Integer> mp = new LinkedHashMap<>();
		st.push(arr[0]);

		for (int i = 1; i < n; i++)
		{
			if (st.isEmpty())
			{
				st.push(arr[i]);
				continue;
			}

			while (!st.isEmpty() && st.peek() > arr[i])
			{
				mp.put(st.peek(), arr[i]);
				st.pop();
			}
			st.push(arr[i]);
		}
		while (!st.isEmpty())
		{
			mp.put(st.peek(), -1);
			st.pop();
		}

		for (Entry<Integer, Integer> ent : mp.entrySet())
		{
			System.out.println(ent.getKey() + " : " + ent.getValue());
		}
	}

	public static void main(String[] args)
	{
		int arr[] = { 5, 7, 1, 2, 6, 0 };

		find(arr);
	}

}
