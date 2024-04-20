package com.karthik.practice.Arrays.Q60_MajorityElementMoreThanNby2Times;

public class Using2Loops
{
	public static void Using2LoopsMethod(int[] arr, int n)
	{
		int maxcount = 0;
		int index = -1;
		for (int i = 0; i < n; i++)
		{
			int count = 0;
			for (int j = 0; j < n; j++)
			{
				if (arr[i] == arr[j])
					count++;
			}
			if (count > maxcount)
			{
				maxcount = count;
				index = i;
			}
		}
		if (maxcount > n / 2)
			System.out.println(arr[index]);
		else
			System.out.println("No");
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 6 };
		int n = arr.length;
		Using2LoopsMethod(arr, n);
	}

}
