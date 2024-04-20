package com.karthik.practice.Stack.Q14_RemoveKDigits;

import java.util.Stack;

public class RemoveKDigits
{
	static String remove(String num, int k)
	{
		StringBuilder sb = new StringBuilder();
		int n = num.length();
		if (k > n)
			return "0";
		if (k == 0)
			return num;
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < n; i++)
		{
			char c = num.charAt(i);
			while (!st.isEmpty() && k > 0 && st.peek() > c)
			{
				st.pop();
				k--;
			}
			if (!st.isEmpty() || c != '0')
				st.push(c);
		}
		while (!st.isEmpty() && k > 0)
		{
			st.pop();
			k--;
		}
		if (st.isEmpty())
			return "0";
		while (!st.isEmpty())
			sb.append(st.pop());
		return sb.reverse().toString();
	}

	public static void main(String[] args)
	{
		String str = "149811";
		int k = 3;
		System.out.println(remove(str, k));
	}

}
