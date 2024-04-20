package com.karthik.practice.Arrays.Q09_FindDuplicateInArrayWithConstantSpace;

import java.util.ArrayList;
import java.util.List;

public class Method2
{
	public static List<Integer> findDuplicates(int[] arr, int len)
	{
		List<Integer> output = new ArrayList<>();
		for (int i = 0; i < len; i++)
		{
			int index = Math.abs(arr[i]) - 1;
			if (arr[index] < 0)
				output.add(index + 1);
			arr[index] = -arr[index];
		}
		return output;
	}

	public static void main(String[] args)
	{
//		 int[] arr = { 1, 1, 2 };// ans = 1
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 }; // ans = 2,3
//		int[] arr = { 4, 3, 2, 3 }; // ans = 3
		int len = arr.length;
		System.out.println(findDuplicates(arr, len));

	}

}
