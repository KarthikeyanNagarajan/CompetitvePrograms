package com.karthik.practice.Arrays.Q53_TwoSum;

import java.util.ArrayList;
import java.util.List;

public class Using2Loops
{
	public static void Using2LoopsMethod(int[] arr, int n, int k)
	{
		List<Integer> ls = new ArrayList<>();
		for (int i = 0; i < n; i++)
		{
			for (int j = i + 1; j < n; j++)
			{
				if (arr[i] + arr[j] == k)
				{
					ls.add(i);
					ls.add(j);
					break;
				}
			}
			if(ls.size() ==2)
				break;
		}
		System.out.println(ls);
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int n = arr.length;
		int k = 7;
		Using2LoopsMethod(arr, n, k);
	}

}
