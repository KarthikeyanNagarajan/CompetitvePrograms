package com.karthik.practice.Arrays.Q28_MinSwapToBringAllElementsLessOrEqualToK;

import java.util.Arrays;

public class UsingSlidingWindow
{
	public static int UsingSlidingWindowMethod(int[] arr, int n, int k)
	{
		int count = 0, ans = 0;
		for (int i = 0; i < n; i++)
		{
			if (arr[i] > k)
			{
				count++;
			}
			else if (count > 0)
			{
				int temp = arr[i];
				arr[i] = arr[i - count];
				arr[i - count] = temp;
				ans++;
			}
		}
		Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
		return ans;
	}

	public static void main(String[] args)
	{
		int[] arr = { 2, 1, 5, 6, 3 };
		int k = 3;
		int ans = UsingSlidingWindowMethod(arr, arr.length, k);
		System.out.println();
		System.out.println(ans);
	}
}
