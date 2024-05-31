package com.karthik.practice.Arrays.Q61_MajorityElementMoreThanNby3Times;

import java.util.ArrayList;
import java.util.List;

public class BoyerMooreVotingAlgorithm
{
	public static List<Integer> UsingBoyerMooreVotingAlgorithm(int[] arr, int n)
	{
		int cnt1 = 0;
		int element1 = 0;
		int cnt2 = 0;
		int element2 = 0;

		for (int i = 0; i < n; i++)
		{
			if (cnt1 == 0)
			{
				cnt1++;
				element1 = arr[i];
			}
			else if (cnt2 == 0)
			{
				cnt2++;
				element2 = arr[i];
			}
			else if (arr[i] == element1)
				cnt1++;
			else if (arr[i] == element2)
				cnt2++;
			else
			{
				cnt1--;
				cnt2--;
			}
		}

		cnt1 = cnt2 = 0;
		for (int i = 0; i < n; i++)
		{
			if (arr[i] == element1)
				cnt1++;
			else if (arr[i] == element2)
				cnt2++;
		}

		List<Integer> ls = new ArrayList<>();
		if (cnt1 > n / 3)
			ls.add(element1);
		if (cnt2 > n / 3)
			ls.add(element2);

		return ls;
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 6 };
		int n = arr.length;
		System.out.println(UsingBoyerMooreVotingAlgorithm(arr, n));
	}

}
