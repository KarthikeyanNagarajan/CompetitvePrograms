package com.karthik.practice.Stack.Q07_PostfixToInfix;

import java.util.Stack;

public class PostfixToInfix
{
	static String convert(String exp)
	{
		int len = exp.length();
		Stack<String> st = new Stack<>();
		for (int i = 0; i < len; i++)
		{
			String c = String.valueOf(exp.charAt(i));
			if (c.equalsIgnoreCase("+") || c.equalsIgnoreCase("-") || c.equalsIgnoreCase("*") || c.equalsIgnoreCase("/")
					|| c.equalsIgnoreCase("^"))
			{
				String s1 = st.pop();
				String s2 = st.pop();
				String temp = "(" + s2 + c + s1 + ")";
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
		String exp = "ab*c+"; // ((a*b)+c)
		System.out.println(convert(exp));
	}

}
