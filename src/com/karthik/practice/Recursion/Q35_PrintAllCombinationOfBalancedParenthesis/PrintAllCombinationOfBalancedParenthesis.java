package com.karthik.practice.Recursion.Q35_PrintAllCombinationOfBalancedParenthesis;

public class PrintAllCombinationOfBalancedParenthesis
{
	public static void printParenthesis(char str[], int pos, int n, int open, int close)
	{

	}

	public static void print(char str[], int n)
	{
		if (n > 0)
			printParenthesis(str, 0, n, 0, 0);
		return;
	}

	public static void main(String[] args)
	{
		int n = 3;
		char[] str = new char[2 * n];
		print(str, n);
	}

}
