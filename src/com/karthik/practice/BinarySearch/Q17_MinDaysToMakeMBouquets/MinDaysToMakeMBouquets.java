package com.karthik.practice.BinarySearch.Q17_MinDaysToMakeMBouquets;

public class MinDaysToMakeMBouquets
{

	public static boolean possible(int[] arr, int day, int m, int k, int n)
	{
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

	private static int roseGarden(int[] arr, int f, int b, int n)
	{
		long val = f * b;
		if (val > n) // if(n < (long) m * k) (leetcode)
			return -1;

		int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++)
		{
			low = Math.min(low, arr[i]);
			high = Math.max(high, arr[i]);
		}

		while (low <= high)
		{
			int mid = (low + high) / 2;
			if (possible(arr, mid, b, f, n))
				high = mid - 1;
			else
				low = mid + 1;
		}
		return low;
	}

	public static void main(String[] args)
	{
		int[] arr = { 7, 7, 7, 7, 13, 11, 12, 7 };
		int f = 3; // Flower per Bouquet
		int b = 2; // Number of Bouquets
		int n = arr.length;
		int ans = roseGarden(arr, f, b, n);
		if (ans == -1)
			System.out.println("We cannot make m bouquets.");
		else
			System.out.println("We can make bouquets on day " + ans);
	}

}
