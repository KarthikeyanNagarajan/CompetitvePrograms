package com.karthik.practice.BitManipulation.Q12_SingleNumber2;

public class SingleNumber2
{
	public static int func1(int[] arr, int n)
	{
		int cnt = 0;
		int ans = 0;
		for (int bitInd = 0; bitInd < 32; bitInd++)
		{
			cnt = 0;
			for (int i = 0; i < n; i++)
			{
				if ((arr[i] & (1 << bitInd)) != 0)
					cnt++;
			}

			if (cnt % 3 == 1)
				ans = ans | (1 << bitInd);
		}

		return ans;
	}

	public static int func2(int[] arr, int n)
	{
		int ones = 0, twos = 0;

		for (int i = 0; i < n; i++)
		{
			ones = (ones ^ arr[i]) & ~twos;
			twos = (twos ^ arr[i]) & ~ones;
		}

		return ones;
	}

	public static void main(String[] args)
	{
		int[] arr = { 1, 1, 1, 2, 3, 3, 3 };
		int n = arr.length;

		System.out.println(func1(arr, n));
		System.out.println(func2(arr, n));
	}

}
