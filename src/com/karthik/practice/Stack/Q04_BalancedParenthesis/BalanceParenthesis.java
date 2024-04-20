package com.karthik.practice.Stack.Q04_BalancedParenthesis;

import java.util.Stack;

public class BalanceParenthesis
{
	boolean balance(String exp, int len)
	{
		Stack<Character> st = new Stack<>();

		if (exp.charAt(0) == ')')
			return false;

		for (int i = 0; i < len; i++)
		{
			if (exp.charAt(i) == '(')
				st.push(exp.charAt(i));
			else
			{
				if (st.peek() == '(' && exp.charAt(i) == ')')
				{
					st.pop();
					continue;
				}
				else
					return false;
			}
		}
		if (st.size() > 0)
			return false;
		return true;
	}

	public boolean isValid(String s)
	{
		int len = s.length();
		Stack<Character> st = new Stack<>();

		if (s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}')
			return false;

		for (int i = 0; i < len; i++)
		{
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
				st.push(s.charAt(i));
			else
			{
				if (!st.isEmpty() && ((st.peek() == '(' && s.charAt(i) == ')')
						|| (st.peek() == '[' && s.charAt(i) == ']') || (st.peek() == '{' && s.charAt(i) == '}')))
				{
					st.pop();
					continue;
				}
				else
					return false;
			}
		}
		if (st.size() > 0)
			return false;
		return true;
	}

	public static void main(String[] args)
	{
		BalanceParenthesis b = new BalanceParenthesis();
		System.out.println(b.balance("()()", "()()".length()));
		System.out.println(b.balance("()()(", "()()(".length()));
		System.out.println(b.balance("()(()", "()(()".length()));
	}

}
