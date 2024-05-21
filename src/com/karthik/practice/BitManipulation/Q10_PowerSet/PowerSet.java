package com.karthik.practice.BitManipulation.Q10_PowerSet;

import java.util.ArrayList;
import java.util.List;

public class PowerSet
{

	public static List<List<Integer>> printSubsets(int[] nums, int n)
	{
		int subset = 1 << n; // equals to 2 power n

		List<List<Integer>> ans = new ArrayList<>();
		for (int num = 0; num < subset; num++)
		{
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < n; i++)
			{
				if ((num & (1 << i)) != 0)
					list.add(nums[i]);
			}
			ans.add(list);
		}
		return ans;
	}

	public static void main(String[] args)
	{
		int[] nums = { 1, 2, 3 };
		int n = nums.length;

		List<List<Integer>> ans = printSubsets(nums, n);
		for (List<Integer> ls : ans)
		{
			System.out.println(ls);
		}
	}

}
