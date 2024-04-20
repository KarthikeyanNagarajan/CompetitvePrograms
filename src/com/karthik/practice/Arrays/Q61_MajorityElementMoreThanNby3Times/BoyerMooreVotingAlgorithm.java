package com.karthik.practice.Arrays.Q61_MajorityElementMoreThanNby3Times;

import java.util.ArrayList;
import java.util.List;

public class BoyerMooreVotingAlgorithm
{
	public static List<Integer> UsingBoyerMooreVotingAlgorithm(int[] arr, int n)
	{
		List<Integer> ls = new ArrayList<>();
		int num1 = -1, num2 = -1, count1 = 0, count2 = 0, i = 0;
		for (i = 0; i < n; i++)
		{
			if (arr[i] == num1)
				count1++;
			else if (arr[i] == num2)
				count2++;
			else if (count1 == 0)
			{
				num1 = arr[i];
				count1 = 1;
			}
			else if (count2 == 0)
			{
				num2 = arr[i];
				count2 = 1;
			}
			else
			{
				count1--;
				count2--;
			}
		}

		count1 = count2 = 0;
		for (i = 0; i < n; i++)
		{
			if (arr[i] == num1)
				count1++;
			else if (arr[i] == num2)
				count2++;
		}
		
		if(count1 > n / 3)
			ls.add(num1);
		if(count2 > n / 3)
			ls.add(num2);
		return ls;
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 6 };
		int n = arr.length;
		System.out.println(UsingBoyerMooreVotingAlgorithm(arr, n));
	}

}
