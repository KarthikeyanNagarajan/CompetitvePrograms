package com.karthik.practice.Arrays.Q26_ThreeWayPartitioningOfGivenRange;

import java.util.Arrays;

public class Using2Pointer
{
	public static void Using2PointerMethod(int[] arr, int low, int high, int len)
	{
		int start = 0, end = len - 1;
		for (int i = 0; i <= end; i++)
		{
			if (arr[i] < low)
			{
				if (i == start)
					start++;
				else
				{
					int temp = arr[i];
					arr[i] = arr[start];
					arr[start] = temp;
					start++;
				}
			}
			else if (arr[i] > high)
			{
				int temp = arr[i];
				arr[i] = arr[end];
				arr[end] = temp;
				end--;
				i--;
			}
		}
		Arrays.stream(arr).forEach(i -> System.out.print(i + ","));
	}

	public static void main(String[] args)
	{
		// ans = {1, 5, 4, 2, 1, 3, 14, 20, 20, 98, 87, 32, 54}
		int[] arr = { 1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32 };
		int lowVal = 14, highVal = 20;
		Using2PointerMethod(arr, lowVal, highVal, arr.length);
	}

}
