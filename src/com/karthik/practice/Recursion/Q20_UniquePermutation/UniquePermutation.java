package com.karthik.practice.Recursion.Q20_UniquePermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniquePermutation
{
	private static void dfs(int ind, int[] arr, boolean[] vis, List<Integer> ds, List<List<Integer>> ans)
	{
		if (ind == arr.length)
		{
			ans.add(new ArrayList<>(ds));
			return;
		}

		for (int i = 0; i < arr.length; ++i)
		{
			// Skip the current number if it's already been used or if it's a duplicate and
			// the duplicate hasn't been used
			if (vis[i] || (i > 0 && arr[i] == arr[i - 1] && !vis[i - 1]))
				continue;

			ds.add(arr[i]);
			vis[i] = true;

			dfs(ind + 1, arr, vis, ds, ans);

			vis[i] = false;
			ds.remove(ds.size() - 1);
		}
	}

	public static List<List<Integer>> permuteUnique(int[] arr)
	{
		Arrays.sort(arr);

		boolean[] vis = new boolean[arr.length];
		List<List<Integer>> ans = new ArrayList<>();

		dfs(0, arr, vis, new ArrayList<>(), ans);

		return ans;
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 1 };
		List<List<Integer>> permuteUnique = permuteUnique(arr);
		System.out.println(permuteUnique);
	}

}
