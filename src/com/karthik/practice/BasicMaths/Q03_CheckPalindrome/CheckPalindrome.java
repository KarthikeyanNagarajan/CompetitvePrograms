package com.karthik.practice.BasicMaths.Q03_CheckPalindrome;

public class CheckPalindrome
{
	static void checkPalindrome(int n)
	{
		int dup = n;
		int revNum = 0;

		while (n > 0)
		{
			int ld = n % 10;
			revNum = (revNum * 10) + ld;
			n = n / 10;
		}
		if (dup == revNum)
			System.out.println(dup + " Is Palindrome");
		else
			System.out.println(dup + " Is Not Palindrome");
	}

	public static void main(String[] args)
	{
		int N = 329823;
		System.out.println("N: " + N);
		checkPalindrome(N);
	}

}
