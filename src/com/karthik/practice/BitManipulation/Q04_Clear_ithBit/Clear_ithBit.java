package com.karthik.practice.BitManipulation.Q04_Clear_ithBit;

public class Clear_ithBit
{

	public static void main(String[] args)
	{
		int N = 13;
		int i = 2;

		System.out.println(N & ~(1 << i));

	}

}
