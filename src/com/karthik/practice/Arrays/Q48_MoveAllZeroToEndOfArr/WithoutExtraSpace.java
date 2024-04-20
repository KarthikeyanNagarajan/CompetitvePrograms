package com.karthik.practice.Arrays.Q48_MoveAllZeroToEndOfArr;

import java.util.Arrays;

public class WithoutExtraSpace
{
	public static void WithoutExtraSpaceMethod(int[] arr, int n)
	{
		int k = 0;
		while (k < n)
		{
			if (arr[k] == 0)
			{
				break;
			}
			else
			{
				k++;
			}
		}
		System.out.println(k);
		int i = k, j = k + 1;
		while (i < n && j < n)
		{
			if (arr[j] != 0)
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
			}
			j++;
		}
		Arrays.stream(arr).forEach(a -> System.out.print(a + " "));
	}

	public static void moveZeroes(int[] nums)
	{
		int n = nums.length;
        int i = 0;
        for(int num : nums)
        {
            if(num != 0)
            {
                nums[i++] = num;
            }
        }

        while(i < n)
            nums[i++] = 0;
		
		Arrays.stream(nums).forEach(a -> System.out.print(a + " "));
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 0, 0, 0, 2, 0, 0, 3, 4, 5 };
		int n = arr.length;
		WithoutExtraSpaceMethod(arr, n);
		System.out.println();
		moveZeroes(arr);
	}

}
