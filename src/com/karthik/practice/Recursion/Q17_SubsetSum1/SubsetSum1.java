package com.karthik.practice.Recursion.Q17_SubsetSum1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SubsetSum1
{
	public static void func(int ind, int sum, List<Integer> arr, int n, List<Integer> sumSubset)
	{
		if (ind == n)
		{
			sumSubset.add(sum);
			return;
		}

		func(ind + 1, sum + arr.get(ind), arr, n, sumSubset);
		func(ind + 1, sum, arr, n, sumSubset);
	}

	public static void main(String[] args)
	{
		List<Integer> arr = Arrays.asList(2, 3);
		int n = 2;
		List<Integer> sumSubset = new ArrayList<>();
		func(0, 0, arr, n, sumSubset);
		Collections.sort(sumSubset);
		System.out.println(sumSubset);
	}

}
