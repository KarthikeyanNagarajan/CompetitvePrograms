package com.karthik.practice.Recursion.Q02_PrintFrom1toN;

public class PrintFrom1toN
{
	public static void print(int i, int n)
	{
		if (i > n)
			return;
		System.out.println(i);
		print(i + 1, n);
	}

	public static void main(String[] args)
	{
		int n = 5;
		print(1, n);
	}

}
