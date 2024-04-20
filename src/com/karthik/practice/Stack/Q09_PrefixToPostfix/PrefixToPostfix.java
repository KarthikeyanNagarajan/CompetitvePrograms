package com.karthik.practice.Stack.Q09_PrefixToPostfix;

import java.util.Stack;

public class PrefixToPostfix
{
	static String convert(String exp)
	{
		int len = exp.length();
		Stack<String> st = new Stack<>();
		for (int i = len - 1; i >= 0; i--)
		{
			String c = String.valueOf(exp.charAt(i));
			if (c.equalsIgnoreCase("+") || c.equalsIgnoreCase("-") || c.equalsIgnoreCase("*") || c.equalsIgnoreCase("/")
					|| c.equalsIgnoreCase("^"))
			{
				String s1 = st.pop();
				String s2 = st.pop();
				String temp = s1 + s2 + c;
				st.push(temp);
			}
			else
				st.push(c);
		}
		String result = st.pop();
		return result;
	}

	public static void main(String[] args)
	{
		String exp = "*-A/BC-/AKL"; // ABC/-AK/L-*
		System.out.println(convert(exp));
	}

}
