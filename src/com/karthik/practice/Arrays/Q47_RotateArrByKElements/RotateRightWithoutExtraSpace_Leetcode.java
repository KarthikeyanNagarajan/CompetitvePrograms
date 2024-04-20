package com.karthik.practice.Arrays.Q47_RotateArrByKElements;

public class RotateRightWithoutExtraSpace_Leetcode
{

	public static void rotate(int[] nums, int k)
	{
		k %= nums.length;
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}

	private static void reverse(int[] nums, int start, int end)
	{
		while (start < end)
			swap(nums, start++, end--);
	}

	private static void swap(int[] nums, int start, int end)
	{
		int temp = nums[start];
		nums[start] = nums[end];
		nums[end] = temp;
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 2;
		rotate(arr, k);
	}

}
