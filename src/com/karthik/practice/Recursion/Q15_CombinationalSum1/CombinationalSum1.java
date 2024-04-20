package com.karthik.practice.Recursion.Q15_CombinationalSum1;

import java.util.ArrayList;
import java.util.List;

public class CombinationalSum1
{
	private static void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds)
	{
		if (ind == arr.length)
		{
			if (target == 0)
				ans.add(new ArrayList<>(ds));
			return;
		}

		if (arr[ind] <= target)
		{
			ds.add(arr[ind]);
			findCombinations(ind, arr, target - arr[ind], ans, ds);
			ds.remove(ds.size() - 1);
		}
		findCombinations(ind + 1, arr, target, ans, ds);
	}

	public static void main(String[] args)
	{
		int[] arr = { 2, 3, 6, 7 };
		int target = 7;
		List<List<Integer>> ans = new ArrayList<>();
		findCombinations(0, arr, target, ans, new ArrayList<>());
		System.out.println(ans);
	}

}
