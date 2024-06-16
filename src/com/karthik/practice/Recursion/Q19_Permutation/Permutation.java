package com.karthik.practice.Recursion.Q19_Permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation
{
	public static void swap(int x, int y, int[] nums)
	{
		int temp = nums[x];
		nums[x] = nums[y];
		nums[y] = temp;
	}

	public static void recurPermute(int index, int[] nums, List<int[]> ans)
	{
		if (index == nums.length)
		{
			ans.add(Arrays.copyOf(nums, nums.length));
			return;
		}

		for (int i = index; i < nums.length; i++)
		{
			swap(index, i, nums);
			recurPermute(index + 1, nums, ans);
			swap(index, i, nums);
		}
	}

	public static void main(String[] args)
	{
		int[] nums = { 1, 2, 3 };
		List<int[]> ans = new ArrayList<>();
		recurPermute(0, nums, ans);

		for (int[] x : ans)
		{
			for (int y : x)
			{
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}

}
