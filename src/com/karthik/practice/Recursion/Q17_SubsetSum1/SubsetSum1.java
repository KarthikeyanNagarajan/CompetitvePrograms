package com.karthik.practice.Recursion.Q17_SubsetSum1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubsetSum1
{
	public static void func(int ind, int sum, List<Integer> arr, int n, List<Integer> ans)
	{
		if (ind == n)
		{
			ans.add(sum);
			return;
		}

		func(ind + 1, sum + arr.get(ind), arr, n, ans);
		func(ind + 1, sum, arr, n, ans);
	}

	public static void main(String[] args)
	{
		List<Integer> arr = Arrays.asList(2, 3);
		int n = 2;

		List<Integer> ans = new ArrayList<>();
		func(0, 0, arr, n, ans);

		Collections.sort(ans);
		System.out.println(ans);
	}

}
