package com.karthik.practice.BitManipulation.Q07_CheckIfNumberIsPowerOf2;

public class CheckIfNumberIsPowerOf2
{

	public static void main(String[] args)
	{
		int N = 16;

		System.out.println((N & N - 1) == 0);

	}

}
