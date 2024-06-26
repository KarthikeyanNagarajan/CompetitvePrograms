package com.karthik.practice.Arrays.Q11_FindDuplicateInArrayWithConstantSpace;

import java.util.Arrays;

public class Method1
{
	// working
	public static void Method(int[] arr, int n)
	{
		for (int i = 0; i < n; i++)
		{
			arr[arr[i] % n] = arr[arr[i] % n] + n;
		}
		// arr = [1, 16, 10, 20, 3, 6, 15] after iteration
		for (int i = 0; i < n; i++)
		{
			if (arr[i] / n > 1)
				System.out.print(i + " ");
		}
	}

	// working only in sorted array
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
		Method(arr, len);
		// System.out.println(findDuplicate(arr));
	}

}
