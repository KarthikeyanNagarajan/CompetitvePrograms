package com.karthik.practice.Stack.Q46_MinSquaresOfCharCountsAfterEmovingKChars;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinSquares
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
		for (int i = 0; i < MAX_CHAR; i++)
		{
			if (frequency[i] != 0)
				q.add(frequency[i]);
		}
		while (k != 0)
		{
			q.add(q.poll() - 1);
			k--;
		}
		int result = 0;
		while (!q.isEmpty())
			result += q.peek() * q.poll();
		return result;
	}

	public static void main(String[] args)
	{
		String str = "abbccc"; // Input 1
		int k = 2;
		System.out.println(minStringValue(str, k)); //6

		str = "aaab"; // Input 2
		k = 2;
		System.out.println(minStringValue(str, k));
	}

}
