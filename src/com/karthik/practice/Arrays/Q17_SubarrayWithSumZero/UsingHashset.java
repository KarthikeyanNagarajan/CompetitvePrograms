package com.karthik.practice.Arrays.Q17_SubarrayWithSumZero;

import java.util.HashSet;
import java.util.Set;

public class UsingHashset
{
	public static boolean UsingHashsetMethod(int[] arr, int n)
	{
		Set<Integer> hs = new HashSet<>();
		int sum = 0;
		for (int i = 0; i < n; i++)
		{
			sum += arr[i];
			if (arr[i] == 0 || sum == 0 || hs.contains(sum))
				return true;

			hs.add(sum);
		}
		return false;
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, -1, 2, 3, 4, 5 };
		System.out.println(UsingHashsetMethod(arr, arr.length));

	}

}
