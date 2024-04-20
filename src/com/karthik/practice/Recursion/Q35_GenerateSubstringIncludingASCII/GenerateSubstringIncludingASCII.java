package com.karthik.practice.Recursion.Q35_GenerateSubstringIncludingASCII;

public class GenerateSubstringIncludingASCII
{
	public static void FindSub(int i, String str, String ans)
	{
		if (i == str.length())
		{
			if (ans.length() > 0)
			{
				System.out.println(ans);
			}
			return;
		}

		char ch = str.charAt(i);

		// If the i-th character is not included in the subsequence
		FindSub(i + 1, str, ans);

		// Including the i-th character in the subsequence
		FindSub(i + 1, str, ans + ch);

		// Include the ASCII value of the ith character in the subsequence
		FindSub(i + 1, str, ans + (int) ch);
	}

	public static void main(String[] args)
	{
		String str = "ab";
		String ans = "";
		FindSub(0, str, ans);
	}

}
