package com.karthik.practice.Recursion.Q18_SubsetSum2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetSum2
{
	public static void func(int ind, List<Integer> arr, List<Integer> ds, List<List<Integer>> ans)
	{
		ans.add(new ArrayList<>(ds));
		for (int i = ind; i < arr.size(); i++)
		{
			if (i != ind && arr.get(i) == arr.get(i - 1))
				continue;
			ds.add(arr.get(i));
			func(i + 1, arr, ds, ans);
			ds.remove(ds.size() - 1);
		}
	}

	public static void main(String[] args)
	{
		List<Integer> arr = Arrays.asList(1, 2, 2);

		List<List<Integer>> ans = new ArrayList<>();
		func(0, arr, new ArrayList<>(), ans);

		System.out.println(ans);
	}

}
