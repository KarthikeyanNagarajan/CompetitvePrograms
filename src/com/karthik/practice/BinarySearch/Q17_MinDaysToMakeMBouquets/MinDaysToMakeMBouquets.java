package com.karthik.practice.BinarySearch.Q17_MinDaysToMakeMBouquets;

public class MinDaysToMakeMBouquets
{

	public static boolean possible(int[] arr, int day, int m, int k)
	{
		int n = arr.length;
		int cnt = 0;
		int noOfB = 0;
		for (int i = 0; i < n; i++)
		{
			if (arr[i] <= day)
				cnt++;
			else
			{
				noOfB += (cnt / k);
				cnt = 0;
			}
		}
		noOfB += (cnt / k);
		return noOfB >= m;
	}

	private static int roseGarden(int[] arr, int k, int m)
	{
		int n = arr.length;
		long val = m * k;
		if (val > n) // if(n < (long) m * k) (leetcode)
			return -1;

		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++)
		{
			min = Math.min(min, arr[i]);
			max = Math.max(max, arr[i]);
		}

		int low = min, high = max;
		while (low <= high)
		{
			int mid = (low + high) / 2;
			if (possible(arr, mid, m, k))
				high = mid - 1;
			else
				low = mid + 1;
		}
		return low;
	}

	public static void main(String[] args)
	{
		int[] arr = { 7, 7, 7, 7, 13, 11, 12, 7 };
		int k = 3; // Flower per Bouquet
		int m = 2; // Number of Bouquets
		int ans = roseGarden(arr, k, m);
		if (ans == -1)
			System.out.println("We cannot make m bouquets.");
		else
			System.out.println("We can make bouquets on day " + ans);
	}

}
