package com.karthik.practice.BinarySearch.Q25_MinimiseMaxDistToGasStation;

public class MinimiseMaxDistToGasStation
{
	public static int numberOfGasStationsRequired(double dist, int[] arr, int n)
	{
		int cnt = 0;
		for (int i = 1; i < n; i++)
		{
			int numberInBetween = (int) ((arr[i] - arr[i - 1]) / dist);
			if ((arr[i] - arr[i - 1]) == (dist * numberInBetween))
			{
				numberInBetween--;
			}
			cnt += numberInBetween;
		}
		return cnt;
	}

	public static double minimiseMaxDistance(int[] arr, int k, int n)
	{
		double low = 0, high = 0;

		// Find the maximum difference in distance:
		for (int i = 0; i < n - 1; i++)
		{
			high = Math.max(high, (double) (arr[i + 1] - arr[i]));
		}

		double diff = 1e-6;
		while (high - low > diff)
		{
			double mid = (low + high) / (2.0);
			int cnt = numberOfGasStationsRequired(mid, arr, n);
			if (cnt <= k)
				high = mid;
			else
				low = mid;
		}
		return high;
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 4;
		int n = arr.length;
		double ans = minimiseMaxDistance(arr, k, n);
		System.out.println("The answer is: " + ans);
	}
}
