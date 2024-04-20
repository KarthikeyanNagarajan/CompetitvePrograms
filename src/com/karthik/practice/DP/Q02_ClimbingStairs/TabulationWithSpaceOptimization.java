package com.karthik.practice.DP.Q02_ClimbingStairs;

public class TabulationWithSpaceOptimization
{

	private static int fibo(int n)
	{
		int prev = 1;
		int prev1 = 1;
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
		int n = 3;
		System.out.println(fibo(n));
	}

}
