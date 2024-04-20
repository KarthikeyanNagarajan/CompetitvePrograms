package com.karthik.practice.Stack.Q31_ReverseStringUsingStackRecursion;

import java.util.Stack;

public class ReverseString
{
	static String reverse(StringBuilder str)
	{
		Stack<String> st = new Stack<>();
		int n = str.length();
		for (int i = 0; i < n; i++)
		{
			st.push(String.valueOf(str.charAt(i)));
		}
		str.delete(0, str.length());
		while (!st.isEmpty())
		{
			str.append(st.peek());
			st.pop();
		}
		return str.toString();
	}

	public static void main(String[] args)
	{
		StringBuilder str = new StringBuilder("abcde");
		System.out.println(reverse(str));
	}

}
