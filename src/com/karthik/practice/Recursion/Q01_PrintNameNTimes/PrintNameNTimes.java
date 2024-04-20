package com.karthik.practice.Recursion.Q01_PrintNameNTimes;

public class PrintNameNTimes
{
	public static void print(int i, int n)
	{
		if(i > n)
			return;
		System.out.println("abc");
		print(i + 1, n);
	}

	public static void main(String[] args)
	{
		int n = 5;
		print(1, n);
	}

}
