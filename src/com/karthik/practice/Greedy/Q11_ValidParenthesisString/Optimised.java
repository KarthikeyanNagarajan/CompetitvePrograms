package com.karthik.practice.Greedy.Q11_ValidParenthesisString;

public class Optimised
{
	public static boolean func(String str, int n)
	{
		int min = 0, max = 0;

		for (int i = 0; i < n; i++)
		{
			if (str.charAt(i) == '(')
			{
				min = min + 1;
				max = max + 1;
			}
			else if (str.charAt(i) == ')')
			{
				min = min - 1;
				max = max - 1;
			}
			else
			{
				min = min - 1;
				max = max + 1;
			}

			if (min < 0)
				min = 0;

			if (max < 0)
				return false;
		}

		return (min == 0);
	}

	public static void main(String[] args)
	{
		String str = "()*)";
		int n = str.length();
		System.out.println(func(str, n));
	}

}
