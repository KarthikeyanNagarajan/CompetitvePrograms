package com.karthik.practice.Stack.Q37_ExpressionContainsRedundantBracketOrNot;

import java.util.Stack;

public class RedundancyBracket
{
	static boolean checkRedundancy(String str)
	{
		Stack<Character> st = new Stack<>();
		char[] ch = str.toCharArray();
		for (char c : ch)
		{
			if (c == ')')
			{				
				char top = st.pop();
				boolean flag = true;
				while (top != '(')
				{
					if (c == '+' || c == '-' || c == '*' || c == '/')
						flag = false;
					top = st.pop();
				}
				if (flag == true)
					return true;
			}
			else
				st.push(c);
		}		
		return false;
	}

	static void findRedundant(String str)
	{
		boolean ans = checkRedundancy(str);
		if (ans == true)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		String str = "((a+b))";
		System.out.println(str);
		findRedundant(str);

	}

}
