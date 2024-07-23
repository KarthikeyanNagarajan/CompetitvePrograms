package com.karthik.practice.Greedy.Q11_ValidParenthesisString;

public class UsingRecursion
{
	public static boolean func(String str, int n, int ind, int cnt)
	{
		if (cnt < 0)
			return false;

		if (ind == n)
			return (cnt == 0);

		if (str.charAt(ind) == '(')
			return func(str, n, ind + 1, cnt + 1);

		if (str.charAt(ind) == ')')
			return func(str, n, ind + 1, cnt - 1);

		return func(str, n, ind + 1, cnt + 1) || func(str, n, ind + 1, cnt - 1) || func(str, n, ind + 1, cnt);
	}

	public static void main(String[] args)
	{
		String str = "()*)";
		int n = str.length();
		System.out.println(func(str, n, 0, 0));
	}

}
