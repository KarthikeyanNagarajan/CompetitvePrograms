package com.karthik.practice.Arrays.Q20_LongestConsecutiveSubarray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Method1
{
	// Not Working for few testcases
	public static int UsingMethod1(int[] arr, int n)
	{
		Arrays.sort(arr);
		int ans = 0, count = 0;
		for (int i = 0; i < n; i++)
		{
			if (i > 0 && arr[i] == arr[i - 1] + 1)
				count++;
			else
				count = 1;
			ans = Math.max(ans, count);
		}
		return ans;
	}

	// Working
	public static int longestConsecutive(int[] nums)
	{
		int ans = 0;
		Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());

		for (int num : nums)
		{
			// Num is the start of a sequence
			if (set.contains(num - 1))
				continue;
			int length = 1;
			while (set.contains(++num))
				++length;
			ans = Math.max(ans, length);
		}

		return ans;
	}

	// Working
	public static int longestConsecutive1(int[] nums)
	{
		Set<Integer> set = new HashSet<>();
		for (int n : nums)
		{
			set.add(n);
		}
		int ans = 0;
		for (int n : set)
		{
			if (!set.contains(n - 1))
			{ // only check for one direction
				int m = n + 1;
				while (set.contains(m))
				{
					m++;
				}
				ans = Math.max(ans, m - n);
			}
		}
		return ans;
	}

	public static void main(String[] args)
	{
		// int[] arr = { 2, 3, 4, 6, 7, 8, 9, 10 }; // ans = 5
		int[] arr = { 4, 0, -4, -2, 2, 5, 2, 0, -8, -8, -8, -8, -1, 7, 4, 5, 5, -4, 6, 6, -3 };
		System.out.println(UsingMethod1(arr, arr.length));
		System.out.println(longestConsecutive1(arr));

	}

}
