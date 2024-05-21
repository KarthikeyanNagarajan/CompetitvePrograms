package com.karthik.practice.BitManipulation.Q08_CountSetBits;

public class CountSetBits
{
	public static int countSetBit1(int n)
	{
		int cnt = 0;

		while (n != 0)
		{
			n = n & (n - 1);
			cnt += 1;
		}

		return cnt;
	}
	
	public static int countSetBit2(int n)
	{
		int cnt = 0;

		while (n > 1)
		{
			if (n % 2 == 1) // n & 1
				cnt += 1;
			n = n / 2; // n >> 1
		}

		if (n == 1)
			cnt += 1;

		return cnt;
	}

	public static void main(String[] args)
	{
		int n = 13;

		System.out.println(countSetBit1(n));
		System.out.println(countSetBit2(n));
	}

}
