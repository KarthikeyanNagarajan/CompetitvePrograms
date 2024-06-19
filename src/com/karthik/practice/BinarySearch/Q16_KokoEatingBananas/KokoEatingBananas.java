package com.karthik.practice.BinarySearch.Q16_KokoEatingBananas;

public class KokoEatingBananas
{
	public static int calculateTotalHours(int[] arr, int hourly, int n)
	{
		int totalHour = 0;

		for (int i = 0; i < n; i++)
			totalHour += Math.ceil((double) (arr[i]) / (double) (hourly));

		return totalHour;
	}

	private static int minimumRateToEatBananas(int[] arr, int n, int h)
	{
		int low = 1, high = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++)
			high = Math.max(high, arr[i]);

		while (low <= high)
		{
			int mid = (low + high) / 2;
			int totalH = calculateTotalHours(arr, mid, n);
			if (totalH <= h)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return low;
	}

	public static void main(String[] args)
	{
		int[] arr = { 7, 15, 6, 3 };
		int h = 8;
		int n = arr.length;
		int ans = minimumRateToEatBananas(arr, n, h);
		System.out.println("Koko should eat at least " + ans + " bananas/hr.");
	}

}
