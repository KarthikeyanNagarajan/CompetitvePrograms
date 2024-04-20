package com.karthik.practice.Heap.Q21_MinSumSquaresCharCountInStringRemovingKChar;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinSumSquaresCharCountInStringRemovingKChar
{
	static final int MAX_CHAR = 26;

	static int minStringValue(String str, int k)
	{
		int l = str.length();

		if (k >= l)
			return 0;

		int[] frequency = new int[MAX_CHAR];
		for (int i = 0; i < l; i++)
			frequency[str.charAt(i) - 'a']++;

		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

		// Push each char frequency into a priority_queue
		for (int i = 0; i < MAX_CHAR; i++)
		{
			if (frequency[i] != 0)
				q.add(frequency[i]);
		}

		// Removal of K characters
		while (k != 0)
		{
			// Get top element in priority_queue, remove it. Decrement by 1 and again push
			// into priority_queue
			q.add(q.poll() - 1);
			k--;
		}

		// After removal of K characters find sum of squares of string Value
		int result = 0;
		while (!q.isEmpty())
		{
			result += q.peek() * q.poll();
		}

		return result;
	}

	public static void main(String args[])
	{
		String str = "abbccc";
		int k = 2;
		System.out.println(minStringValue(str, k));

		str = "aaab";
		k = 2;
		System.out.println(minStringValue(str, k));
	}
}
