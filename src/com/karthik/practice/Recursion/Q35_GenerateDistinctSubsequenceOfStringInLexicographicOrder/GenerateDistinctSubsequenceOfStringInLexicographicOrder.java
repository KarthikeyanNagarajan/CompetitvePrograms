package com.karthik.practice.Recursion.Q35_GenerateDistinctSubsequenceOfStringInLexicographicOrder;

import java.util.Set;
import java.util.TreeSet;

public class GenerateDistinctSubsequenceOfStringInLexicographicOrder
{
	public static void generate(Set<String> st, String s)
	{
		if (s.length() == 0)
			return;

		if (!st.contains(s))
		{
			st.add(s);
			for (int i = 0; i < s.length(); i++)
			{
				String t = s;
				t = t.substring(0, i) + t.substring(i + 1);
				generate(st, t);
			}
		}
		return;
	}

	public static void main(String[] args)
	{
		String s = "xyz";
		TreeSet<String> st = new TreeSet<>();
		generate(st, s);
		for (String str : st)
		{
			System.out.println(str);
		}
	}

}
