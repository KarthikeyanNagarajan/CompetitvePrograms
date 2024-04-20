package com.karthik.practice.DP.Q01_FibonacciSeries;

public class TabulationWithSpaceOptimization
{

	private static int fibo(int n)
	{
		int prev = 1;
		int prev1 = 0;
		int cur = 0;
		for (int i = 2; i <= n; i++)
		{
			cur = prev + prev1;
			prev1 = prev;
			prev = cur;
		}
		return cur;
	}

	public static void main(String[] args)
	{
		int n = 5;
		System.out.println(fibo(n));
	}

}
