package com.karthik.practice.Recursion.Q12_PrintAllSubSequenceOfGivenSum;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubSequenceOfGivenSum
{
	private static void print(int ind, List<Integer> ls, int s, int sum, int[] arr, int n)
	{
		if (ind == n)
		{
			if (s == sum)
			{
				for (int l : ls)
					System.out.print(l + " ");
				System.out.println();
			}
			return;
		}

		ls.add(arr[ind]);
		s += arr[ind];
		print(ind + 1, ls, s, sum, arr, n);
		ls.remove(ls.size() - 1);
		s -= arr[ind];
		print(ind + 1, ls, s, sum, arr, n);
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
