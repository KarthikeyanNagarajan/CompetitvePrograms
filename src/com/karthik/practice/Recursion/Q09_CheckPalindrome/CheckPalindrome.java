package com.karthik.practice.Recursion.Q09_CheckPalindrome;

public class CheckPalindrome
{
	public static boolean print(int i, char[] arr, int n)
	{
		if (i >= n / 2)
			return true;
		if(arr[i] != arr[n - i - 1])
			return false;
		return print(i + 1, arr, n);
	}

	public static void main(String[] args)
	{
		String str = "NALAM";
		int n = str.length();
		char[] arr = str.toCharArray();
		System.out.println(print(0, arr, n));
	}
}
