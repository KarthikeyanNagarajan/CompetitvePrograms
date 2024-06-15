package com.karthik.practice.Recursion.Q38_PrintAllCombinationOfBalancedParenthesis;

import java.util.ArrayList;
import java.util.List;

public class PrintAllCombinationOfBalancedParenthesis
{
	static void generateParenthesis(int left, int right, String s, List<String> ans)
	{
		// terminate
		if (left == 0 && right == 0)
		{
			ans.add(s);
		}

		if (left > right || left < 0 || right < 0)
		{
			// wrong
			return;
		}

		s += "{";
		generateParenthesis(left - 1, right, s, ans);
		s = s.substring(0, s.length() - 1);

		s += "}";
		generateParenthesis(left, right - 1, s, ans);
		s = s.substring(0, s.length() - 1);
	}

	public static void main(String[] args)
	{
		int n = 3;

		List<String> ans = new ArrayList<>();
		String s = "";

		// initially we are passing the counts of open and close as 0
		generateParenthesis(n, n, s, ans);

		for (String k : ans)
		{
			System.out.println(k);
		}
	}

}
