package com.karthik.practice.Recursion.Q06_SumOfFirstNNumbers;

public class ParameterizedMethod
{
	public static void print(int n, int ans)
	{
		if(n < 1)
		{
			System.out.println(ans);
			return;
		}
		print(n -1, ans + n);
	}

	public static void main(String[] args)
	{
		int n = 5;
		print(n, 0);
	}

}
