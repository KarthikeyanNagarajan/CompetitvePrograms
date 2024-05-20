package com.karthik.practice.BitManipulation.Q02_CheckIf_ithBitIsSetOrNot;

public class CheckIf_ithBitIsSetOrNot
{
	public static void main(String[] args)
	{
		int N = 13;
		int i = 2;

		System.out.println((N & (1 << i)) != 0);

		System.out.println(((N >> i) & 1) != 0);
	}
}
