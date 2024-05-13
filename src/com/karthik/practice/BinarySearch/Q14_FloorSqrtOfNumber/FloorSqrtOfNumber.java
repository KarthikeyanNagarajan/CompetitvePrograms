package com.karthik.practice.BinarySearch.Q14_FloorSqrtOfNumber;

public class FloorSqrtOfNumber
{
	// Leetcode Not Working
	private static int floorSqrt(int n)
	{
		int low = 1, high = n;
		while (low <= high)
		{
			int mid = (low + high) / 2;
			int val = mid * mid;
			if (val <= n)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return high;
	}

	// Leetcode Working
	public static int mySqrt(long x)
	{
		long low = 1, high = x + 1;
		while (low < high)
		{
			long mid = (low + high) / 2;
			if (mid > x / mid)
				high = mid;
			else
				low = mid + 1;
		}
		return (int) low - 1;
	}

	// step1: low = 1, high = 29, mid = 15, x/mid = 1
	// step2: low = 1, high = 15, mid = 8, x/mid = 3
	// step3: low = 1, high = 8, mid = 4, x/mid = 7
	// step4: low = 5, high = 8, mid = 6, x/mid = 4
	// step5: low = 5, high = 6, mid = 5, x/mid = 5
	// step6: low = 6, high = 6, Condition breaked
	// step7: retrun (low - 1) = 5

	public static void main(String[] args)
	{
		// int n = 28; // ans = 5
		// int n = 2147395599; // ans = 46339
		int n = 2147483647; // ans = 46340
		// int ans = floorSqrt(n);
		int ans = mySqrt(n);
		System.out.println("The floor of square root of  " + n + " is: " + ans);
	}

}
