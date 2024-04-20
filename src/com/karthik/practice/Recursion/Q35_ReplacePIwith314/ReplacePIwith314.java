package com.karthik.practice.Recursion.Q35_ReplacePIwith314;

public class ReplacePIwith314
{
	private static String replacePi(String s)
	{
		if (s.length() == 0 || s.length() == 1)
			return s;

		if (s.charAt(0) == 'p' && s.charAt(1) == 'i')
		{
			String output = replacePi(s.substring(2));
			return "3.14" + output;
		}
		else
		{
			String output = replacePi(s.substring(1));
			return s.charAt(0) + output;
		}
	}

	public static void main(String[] args)
	{
		String s = "pipppiiipi"; // ans = 3.14pp3.14ii3.14
		String result = replacePi(s);
		System.out.println(result);
	}

}
