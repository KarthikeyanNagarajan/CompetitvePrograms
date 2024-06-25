package com.karthik.practice.Arrays.Q10_MinNumberOfJumpsToReachEnd;

import java.util.Arrays;

public class UsingRecursionMemoization
{
	private static int jump(int[] nums, int low, int end, int[] dp)
	{

		// We reached the end. No jumps to make further
		if (low == end)
			return 0;

		if (dp[low] != -1)
			return dp[low];

		int min_jumps = Integer.MAX_VALUE - 1;

		// We will try to make all possible jumps from the current index
		// and select the minimum of those.
		// It does not matter if we try from 1 to nums[idx] or from nums[idx] to 1.
		for (int j = nums[low]; j >= 1; --j)
		{
			// If we make this jump 'j' distance away from idx,
			// do we overshoot?
			// If we land within the nums, we will test further.
			if (low + j <= end)
			{
				// Make a jump to idx + j index and explore further,
				// then update min_jumps with the minimum jumps
				// we made to reach the end while trying all possible
				// nums[idx] jumps from the current index.
				min_jumps = Math.min(min_jumps, 1 + jump(nums, low + j, end, dp));
			}
		}

		return dp[low] = min_jumps;
	}

	private static int minJumps(int[] nums)
	{
		int[] dp = new int[nums.length];
		Arrays.fill(dp, -1);
		return jump(nums, 0, nums.length - 1, dp);
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
		System.out.println(minJumps(arr));
	}

}
