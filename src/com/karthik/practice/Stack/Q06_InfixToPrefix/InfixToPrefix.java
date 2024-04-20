package com.karthik.practice.Stack.Q06_InfixToPrefix;

import java.util.Stack;

public class InfixToPrefix
{
	static int Prec(char a)
	{
		switch (a)
		{
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
			return 2;
		case '^':
			return 3;
		}
		return -1;
	}

	static String convert(String exp)
	{
		String result = new String("");
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < exp.length(); i++)
		{
			if (Character.isLetterOrDigit(exp.charAt(i)))
				result += exp.charAt(i);
			else if (exp.charAt(i) == '(')
				st.push(exp.charAt(i));
			else if (exp.charAt(i) == ')')
			{
				while (!st.isEmpty() && st.peek() != '(')
				{
					result += st.pop();
				}
				st.pop();
			}
			else
			{
				while (!st.isEmpty() && Prec(exp.charAt(i)) <= Prec(st.peek()))
				{
					result += st.pop();
				}
				st.push(exp.charAt(i));
			}
		}
		while (!st.isEmpty())
		{
			if (st.peek() == '(')
				return "Invalid Expression";
			result += st.pop();
		}
		return result;
	}

	public static void main(String[] args)
	{
		String exp = "(p+q)*(m-n)";
		StringBuilder sb = new StringBuilder(exp);
		sb.reverse();
		exp = sb.toString();
		System.out.println(exp);
		char[] c = exp.toCharArray();
		for (int i = 0; i < c.length; i++)
		{
			if (c[i] == '(')
				c[i] = ')';
			else if (c[i] == ')')
				c[i] = '(';
		}
		exp = String.valueOf(c);
		System.out.println(exp);
		StringBuilder sb1 = new StringBuilder(convert(exp));
		System.out.println(sb1.reverse().toString());
	}

}
