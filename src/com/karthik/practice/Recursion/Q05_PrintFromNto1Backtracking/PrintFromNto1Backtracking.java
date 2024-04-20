package com.karthik.practice.Recursion.Q05_PrintFromNto1Backtracking;

public class PrintFromNto1Backtracking
{
	public static void print(int i, int n)
	{
		if (i > n)
			return;
		print(i + 1, n);
		System.out.println(i);
	}
	
	public static void main(String[] args)
	{
		int n = 5;
		print(1, n);
	}

}
