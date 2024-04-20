package com.karthik.practice.Recursion.Q13_PrintAnyOneSubSequenceOfGivenSum;

import java.util.ArrayList;
import java.util.List;

public class PrintAnyOneSubSequenceOfGivenSum
{
	private static boolean print(int ind, List<Integer> ls, int s, int sum, int[] arr, int n)
	{
		if (ind == n)
		{
			if (s == sum)
			{
				for (int l : ls)
					System.out.print(l + " ");
				System.out.println();
				return true;
			}
			else
				return false;
		}

		ls.add(arr[ind]);
		s += arr[ind];
		if (print(ind + 1, ls, s, sum, arr, n))
			return true;
		ls.remove(ls.size() - 1);
		s -= arr[ind];
		if (print(ind + 1, ls, s, sum, arr, n))
			return true;
		return false;
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 1 };
		int n = 3;
		int sum = 2;
		List<Integer> ls = new ArrayList<>();
		print(0, ls, 0, sum, arr, n);
	}

}
