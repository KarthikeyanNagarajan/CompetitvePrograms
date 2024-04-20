package com.karthik.practice.Stack.Q15_AreaOfLargestRectangleInHistogram;

public class Method1
{
	static int hist(int[] arr, int n)
	{
		int maxArea = 0;
		for (int i = 0; i < n; i++)
		{
			int minHeight = Integer.MAX_VALUE;
			for (int j = i; j < n; j++)
			{
				minHeight = Math.min(minHeight, arr[j]);
				maxArea = Math.max(maxArea, minHeight * (j - i + 1));
			}
		}
		return maxArea;
	}

	public static void main(String[] args)
	{
		int arr[] = { 6, 2, 5, 4, 5, 1, 6 };
		int n = 7;
		System.out.println(hist(arr, n));
	}

}
