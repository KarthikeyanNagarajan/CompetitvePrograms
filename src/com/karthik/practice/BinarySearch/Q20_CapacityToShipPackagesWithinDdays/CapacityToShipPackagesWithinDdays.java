package com.karthik.practice.BinarySearch.Q20_CapacityToShipPackagesWithinDdays;

public class CapacityToShipPackagesWithinDdays
{

	public static int findDays(int[] weights, int capacity, int n)
	{
		int days = 1;
		int load = 0;		
		for (int i = 0; i < n; i++)
		{
			if(load + weights[i] > capacity)
			{
				days += 1;
				load = weights[i];
			}
			else
				load += weights[i];
		}
		return days;
	}

	private static int leastWeightCapacity(int[] weights, int d)
	{
		int n = weights.length;
		int low = Integer.MIN_VALUE, high = 0;
		for (int i = 0; i < n; i++)
		{
			high += weights[i];
			low = Math.max(low, weights[i]);
		}

		while (low <= high)
		{
			int mid = (low + high) / 2;
			int numOfDays = findDays(weights, mid, n);
			if (numOfDays <= d)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return low;
	}

	public static void main(String[] args)
	{
		int[] weights = { 5, 4, 5, 2, 3, 4, 5, 6 };
		int d = 5;
		int ans = leastWeightCapacity(weights, d);
		System.out.println("The minimum capacity should be: " + ans);
	}

}
