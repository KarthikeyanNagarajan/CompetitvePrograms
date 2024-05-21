package com.karthik.practice.BitManipulation.Q09_MinBitFlipsToConvertNumber;

public class MinBitFlipsToConvertNumber
{

	public static int countSetBit(int n)
	{
		int cnt = 0;

		while (n != 0)
		{
			n = n & (n - 1);
			cnt += 1;
		}

		return cnt;
	}

	public static void main(String[] args)
	{
		int start = 3;
		int goal = 4;

		int ans = start ^ goal;

		System.out.println(countSetBit(ans));

	}

}
