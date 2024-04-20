package com.karthik.practice.Stack.Q05_InfixToPostfix;

import java.util.Stack;

public class InfixToPostfix
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
		System.out.println(convert(exp));
	}

}
