package com.karthik.practice.Arrays.Q08_IndexedOfSubArraySum;

import java.util.ArrayList;

public class IndexedOfSubArraySum
{
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
	{
		ArrayList<Integer> ans = new ArrayList<>();

		int start = 0, end = 0, sum = 0;

		while (end < n)
		{
			sum += arr[end];

			while (sum > s && start < end)
				sum -= arr[start++];

			if (sum == s)
			{
				ans.add(start);
				ans.add(end);
				return ans;
			}
			end++;
		}

		ans.add(-1);
		return ans;
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 7, 5 };
		int n = 5, s = 12;
		ArrayList<Integer> ans = subarraySum(arr, n, s);
		System.out.println(ans);
	}

}
