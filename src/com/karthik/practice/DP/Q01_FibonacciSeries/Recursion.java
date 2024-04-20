package com.karthik.practice.DP.Q01_FibonacciSeries;

public class Recursion
{
	private static int recur(int n)
	{
		if (n <= 1)
			return n;
		return recur(n - 1) + recur(n - 2);
	}

	public static void main(String[] args)
	{
		int n = 5;
		System.out.println(recur(n));
	}

}
