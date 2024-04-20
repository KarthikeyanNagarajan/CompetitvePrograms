package com.karthik.practice.Stack.Q10_PostfixToPrefix;

import java.util.Stack;

public class PostfixToPrefix
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
				String temp = c + s2 + s1;
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
		String exp = "ABC/-AK/L-*"; // *-A/BC-/AKL
		System.out.println(convert(exp));
	}

}
