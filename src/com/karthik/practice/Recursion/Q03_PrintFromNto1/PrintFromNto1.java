package com.karthik.practice.Recursion.Q03_PrintFromNto1;

public class PrintFromNto1
{
	public static void print(int i, int n)
	{
		if (i < 1)
			return;
		System.out.println(i);
		print(i - 1, n);
	}

	public static void main(String[] args)
	{
		int n = 5;
		print(n, n);
	}

}
