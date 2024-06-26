package com.karthik.practice.BinarySearch.Q21_AggressiveCows;

import java.util.Arrays;

public class AggressiveCows
{

	public static boolean canWePlace(int[] stalls, int dist, int cows, int n)
	{
		int cntCows = 1; // no. of cows placed
		int last = stalls[0]; // position of last placed cow.

		for (int i = 1; i < n; i++)
		{
			if (stalls[i] - last >= dist)
			{
				cntCows++;
				last = stalls[i];
			}

			if (cntCows >= cows)
				return true;
		}
		return false;
	}

	private static int aggressiveCows(int[] stalls, int k, int n)
	{
		Arrays.sort(stalls);

		int low = 1, high = stalls[n - 1] - stalls[0];
		while (low <= high)
		{
			int mid = (low + high) / 2;
			if (canWePlace(stalls, mid, k, n))
				low = mid + 1;
			else
				high = mid - 1;
		}
		return high;
	}

	public static void main(String[] args)
	{
		int[] stalls = { 0, 3, 4, 7, 10, 9 };
		int k = 4;
		int n = stalls.length;
		int ans = aggressiveCows(stalls, k, n);
		System.out.println("The maximum possible minimum distance is: " + ans);
	}

}
