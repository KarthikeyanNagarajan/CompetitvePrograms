package com.karthik.practice.Recursion.Q16_CombinationalSum2;

import java.util.ArrayList;
import java.util.List;

public class CombinationalSum2
{
	private static void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds)
	{
		if (target < 0)
			return;
		if (target == 0)
		{
			ans.add(new ArrayList<>(ds));
			return;
		}

		for (int i = ind; i < arr.length; ++i)
		{
			if (i > ind && arr[i] == arr[i - 1])
				continue;
			ds.add(arr[i]);
			findCombinations(i + 1, arr, target - arr[i], ans, ds);
			ds.remove(ds.size() - 1);
		}
	}

	public static void main(String[] args)
	{
		int[] arr = { 10, 1, 2, 7, 6, 1, 5 };
		int target = 8;
		List<List<Integer>> ans = new ArrayList<>();
		findCombinations(0, arr, target, ans, new ArrayList<>());
		System.out.println(ans);
	}

}
