package com.karthik.practice.Recursion.Q10_FibonacciSeries;

public class FibonacciSeries
{
	public static int print(int n)
	{
		if(n <= 1)
			return n;
		return print(n - 1) + print(n - 2);
	}

	public static void main(String[] args)
	{
		System.out.println(print(4));
	}
}
