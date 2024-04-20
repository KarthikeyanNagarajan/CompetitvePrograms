package com.karthik.practice.Arrays.Q62_PowXtoN;

public class SimpleMethod
{
	public static void UsingSimpleMethod(int x, int n)
	{
		double ans = 1.0;
		for (int i = 0; i < n; i++)
		{
			ans = ans * x;
		}
		System.out.println(ans);
	}

	public static void main(String[] args)
	{
		int x = 2;
		int n = 3;
		UsingSimpleMethod(x, n);
	}

}
