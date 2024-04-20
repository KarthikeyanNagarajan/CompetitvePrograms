package com.karthik.practice.DP.Q02_ClimbingStairs;

public class Recursion
{
	private static int recur(int n)
	{
		if (n <= 1)
			return 1;
		return recur(n - 1) + recur(n - 2);
	}

	public static void main(String[] args)
	{
		int n = 3;
		System.out.println(recur(n));
	}

}
