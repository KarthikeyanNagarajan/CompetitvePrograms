package com.karthik.practice.Arrays.Q24_TripletSumInArrayOfGivenSum;

import java.util.HashSet;
import java.util.Set;

public class UsingHashSet
{
	public static boolean UsingHashSetMethod(int[] arr, int sum, int n)
	{
		for (int i = 0; i < n - 2; i++)
		{
			Set<Integer> hs = new HashSet<>();
			int curr = sum - arr[i];
			for (int j = i + 1; j < n; j++)
			{
				if (hs.contains(curr - arr[j]))
				{
					System.out.println(arr[i] + "," + arr[j] + "," + (curr - arr[j]));
					return true;
				}
				hs.add(curr - arr[i]);
			}
		}
		return false;
	}

	public static void main(String[] args)
	{
		int[] arr = { 12, 3, 4, 1, 6, 9 }; // ans = 12,3,9
		int sum = 24;
		UsingHashSetMethod(arr, sum, arr.length);
	}

}
