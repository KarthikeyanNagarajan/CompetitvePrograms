package com.karthik.practice.DP.Q03_FrogJump;

public class TabulationWithSpaceOptimization
{

	public static void main(String[] args)
	{
		int height[] = { 30, 10, 60, 10, 60, 50 };
		int n = height.length;
		int prev = 0;
		int prev2 = 0;
		
		for (int i = 1; i < n; i++)
		{
			int left = prev + Math.abs(height[i] - height[i - 1]);
			int right = Integer.MAX_VALUE;
			if (i > 1)
				right = prev2 + Math.abs(height[i] - height[i - 2]);
			int cur = Math.min(left, right);
			prev2 = prev;
			prev = cur;
		}
		System.out.println(prev);
	}

}
