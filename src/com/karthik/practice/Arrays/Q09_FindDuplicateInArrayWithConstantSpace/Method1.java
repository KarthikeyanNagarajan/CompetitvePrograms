package com.karthik.practice.Arrays.Q09_FindDuplicateInArrayWithConstantSpace;

import java.util.Arrays;

public class Method1
{
	//working
	public static void Method(int[] arr, int len)
	{
		for (int i = 0; i < len; i++)
		{
			arr[arr[i] % len] = arr[arr[i] % len] + len;
		}
		// arr = [1, 16, 10, 20, 3, 6, 15] after iteration
		for (int i = 0; i < len; i++)
		{
			if (arr[i] / len > 1)
				System.out.print(i + " ");
		}
	}
	//working only in sorted array
	public static int findDuplicate(int[] nums)
	{
		Arrays.sort(nums);
		int slow = nums[nums[0]];
		int fast = nums[nums[nums[0]]];

		while (slow != fast)
		{
			slow = nums[slow];
			fast = nums[nums[fast]];
		}

		slow = nums[0];

		while (slow != fast)
		{
			slow = nums[slow];
			fast = nums[fast];
		}

		return slow;
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 21, 3, 6, 3, 6, 1 }; // ans = 1 3 6
		int len = arr.length;
//		Method(arr, len);
		System.out.println(findDuplicate(arr));
	}

}
