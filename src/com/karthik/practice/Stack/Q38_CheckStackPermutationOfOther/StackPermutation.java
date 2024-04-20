package com.karthik.practice.Stack.Q38_CheckStackPermutationOfOther;

import java.util.Stack;

public class StackPermutation
{
	static boolean checkStackPermutation(int[] ip, int[] op, int n)
	{
		Stack<Integer> st = new Stack<>();
		int j = 0;
		for (int i = 0; i < n; i++)
		{
			st.push(ip[i]);
			while (!st.isEmpty() && st.peek() == op[j])
			{
				st.pop();
				j++;
			}
		}
		if (st.isEmpty())
			return true;
		return false;
	}

	public static void main(String[] args)
	{
		int input[] = { 4, 5, 6, 7, 8 };

		// Output Array
		int output[] = { 8, 7, 6, 5, 4 };

		int n = 5;

		if (checkStackPermutation(input, output, n))
			System.out.println("Yes");
		else
			System.out.println("Not Possible");
	}

}
