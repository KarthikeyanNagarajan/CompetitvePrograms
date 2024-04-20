package com.karthik.practice.Stack.Q08_PrefixToInfix;

import java.util.Stack;

public class PrefixToInfix
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
				String temp = "(" + s1 + c + s2 + ")";
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
		String exp = "*-A/BC-/AKL"; // ((A-(B/C))*((A/K)-L))
		System.out.println(convert(exp));
	}

}
