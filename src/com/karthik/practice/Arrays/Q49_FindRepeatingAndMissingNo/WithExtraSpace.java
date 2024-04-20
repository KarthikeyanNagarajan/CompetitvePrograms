package com.karthik.practice.Arrays.Q49_FindRepeatingAndMissingNo;

import java.util.ArrayList;
import java.util.List;

public class WithExtraSpace
{
	public static void WithExtraSpaceMethod(int[] arr, int n)
	{
		int len = n + 1;
		int[] substitute = new int[len];
		List<Integer> ls = new ArrayList<>();
		for (int i = 0; i < n; i++)
		{
			substitute[arr[i]]++;
		}
		for (int j = 1; j <= n; j++)
		{
			if (substitute[j] == 0 || substitute[j] > 1)
			{
				ls.add(j);
			}
		}
		System.out.println(ls);
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 3, 5 };
		int n = arr.length;
		WithExtraSpaceMethod(arr, n);
	}

}
