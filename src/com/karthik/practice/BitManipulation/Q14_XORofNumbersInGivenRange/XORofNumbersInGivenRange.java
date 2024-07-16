package com.karthik.practice.BitManipulation.Q14_XORofNumbersInGivenRange;

public class XORofNumbersInGivenRange
{
	public static int func1(int n)
	{
		int ans = 0;
		for (int i = 1; i <= n; i++)
			ans = ans ^ i;

		return ans;
	}

	public static int func2(int n)
	{
		if (n % 4 == 1)
			return 1;
		else if (n % 4 == 2)
			return n + 1;
		else if (n % 4 == 3)
			return 0;
		else
			return n;
	}

	public static void main(String[] args)
	{
		// To find xor between 1 - n
		int n = 4;
		System.out.println(func1(n));
		System.out.println(func2(n));

		// To find between given range
		int a = 4, b = 7;
		System.out.println((func2(a - 1) ^ func2(b)));
	}

}
