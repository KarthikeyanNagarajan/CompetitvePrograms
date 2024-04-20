package com.karthik.practice.DP.Q03_FrogJump;

public class Recursion
{
	private static int recur(int n, int[] height)
	{
		if (n == 0)
			return 0;
		int left = recur(n - 1, height) + Math.abs(height[n] - height[n - 1]);
		int right = Integer.MAX_VALUE;
		if (n > 1)
			right = recur(n - 2, height) + Math.abs(height[n] - height[n - 2]);
		return Math.min(left, right);
	}

	public static void main(String[] args)
	{
		int[] height = { 30, 10, 60, 10, 60, 50 };
		int n = height.length;
		System.out.println(recur(n - 1, height));
	}

}
