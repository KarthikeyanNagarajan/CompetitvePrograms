package com.karthik.practice.Recursion.Q35_GenerateSubstring;

public class GenerateSubstring
{
	public static void removeDups(String s, String ans)
	{
		if (s.length() == 0)
		{
			System.out.println(ans);
			return;
		}

		char p = s.charAt(0);
		String a = s.substring(1);
		removeDups(a, ans + p);
		removeDups(a, ans);
	}

	public static void main(String[] args)
	{
		String s = "abcd";
		removeDups(s, "");
	}

}
