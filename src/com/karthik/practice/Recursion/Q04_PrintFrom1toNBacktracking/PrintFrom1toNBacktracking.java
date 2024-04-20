package com.karthik.practice.Recursion.Q04_PrintFrom1toNBacktracking;

public class PrintFrom1toNBacktracking
{
	public static void print(int i, int n)
	{
		if (i < 1)
			return;
		print(i - 1, n);
		System.out.println(i);
	}

	public static void main(String[] args)
	{
		int n = 5;
		print(n, n);
	}

}
