package com.karthik.practice.Arrays.Q14_CountPairsEqualToSum;

import com.karthik.practice.Arrays.util.LowerUpperBound;

public class UsingLowerAndUpperBound
{
	public static int UsingLowerAndUpperBoundMethod(int[] arr, int n, int sum)
	{
		int x = 0, count = 0;
		for (int i = 0; i < n - 1; i++)
		{
			x = sum - arr[i];
			int lower = LowerUpperBound.lowerBound(arr, i + 1, n, x);
			int upper = LowerUpperBound.upperBound(arr, i + 1, n, x);
			count += upper - lower;
		}
		return count;
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 4 }; // ans = 2
		int sum = 5;
		int n = arr.length;
		System.out.println(UsingLowerAndUpperBoundMethod(arr, n, sum));

	}

}
