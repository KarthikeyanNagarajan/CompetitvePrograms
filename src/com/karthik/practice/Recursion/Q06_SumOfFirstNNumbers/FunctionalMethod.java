package com.karthik.practice.Recursion.Q06_SumOfFirstNNumbers;

public class FunctionalMethod
{
	public static int print(int n)
	{
		if(n < 1)
			return 0;		
		return n + print(n -1);
	}

	public static void main(String[] args)
	{
		int n = 5;
		System.out.println(print(n));
	}
}
