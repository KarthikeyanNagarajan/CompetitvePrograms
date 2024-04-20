package com.karthik.practice.Arrays.Q49_FindRepeatingAndMissingNo;

import java.util.ArrayList;
import java.util.List;

public class UsingMaths
{
	public static void UsingMathsMethod(int[] arr, int n)
	{
		List<Integer> ls = new ArrayList<>();
		int s = (n * (n + 1)) / 2;
		int missing = 0, repeating = 0, p = 0;
		for (int i = 0; i < n; i++)
		{
			s -= arr[i];
			p -= arr[i] * arr[i];
		}
		missing = (s + p / s) / 2;
		repeating = missing - s;
		ls.add(repeating);
		ls.add(missing);
		System.out.println(ls);
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 3, 5 };
		int n = arr.length;
		UsingMathsMethod(arr, n);
	}

}
