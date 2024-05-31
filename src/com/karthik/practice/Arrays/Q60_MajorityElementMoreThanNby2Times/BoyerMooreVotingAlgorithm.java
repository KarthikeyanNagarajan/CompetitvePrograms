package com.karthik.practice.Arrays.Q60_MajorityElementMoreThanNby2Times;

public class BoyerMooreVotingAlgorithm
{
	public static void UsingBoyerMooreVotingAlgorithm(int[] arr, int n)
	{
		int cnt = 0;
		int element = 0;

		for (int i = 0; i < n; i++)
		{
			if (cnt == 0)
			{
				cnt++;
				element = arr[i];
			}
			else if (arr[i] == element)
				cnt++;
			else
				cnt--;
		}

		cnt = 0;
		for (int i = 0; i < n; i++)
		{
			if (arr[i] == element)
				cnt++;
		}

		if (cnt > n / 2)
			System.out.println(element);
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 6 };
		int n = arr.length;
		UsingBoyerMooreVotingAlgorithm(arr, n);
	}

}
