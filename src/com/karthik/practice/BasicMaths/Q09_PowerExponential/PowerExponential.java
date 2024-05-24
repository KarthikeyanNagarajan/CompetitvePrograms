package com.karthik.practice.BasicMaths.Q09_PowerExponential;

public class PowerExponential
{
	static int powerExponential(int n, int x)
	{
		int ans = 1;

		while (x > 0)
		{
			if (x % 2 == 1)
			{
				ans = ans * n;
				x = x - 1;
			}
			else
			{
				x = x / 2;
				n = n * n;
			}
		}
		return ans;
	}

	public static void main(String[] args)
	{
		int n = 2;
		int x = 5;

		System.out.println(powerExponential(n, x));
	}

}
