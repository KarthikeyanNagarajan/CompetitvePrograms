package com.karthik.practice.Recursion.Q35_RemoveConsecutiveDuplicatesInString;

public class RemoveConsecutiveDuplicatesInString
{
	public static String removeConsecutiveDuplicates(String input)
	{
		if (input.length() <= 1)
			return input;

		if (input.charAt(0) == input.charAt(1))
			return removeConsecutiveDuplicates(input.substring(1));
		else
			return input.charAt(0) + removeConsecutiveDuplicates(input.substring(1));
	}

	public static void main(String[] args)
	{
		String S1 = "geeksforgeeks"; // ans = geksforgeks
		System.out.println(removeConsecutiveDuplicates(S1));

		String S2 = "aabcca"; // ans = abca
		System.out.println(removeConsecutiveDuplicates(S2));
	}

}
