package com.karthik.practice.BasicMaths.Q07_GCDorHCF;

public class Better
{
	public static int findGcd(int n1, int n2)
	{
		for (int i = Math.min(n1, n2); i > 0; i--)
			if (n1 % i == 0 && n2 % i == 0)
				return i;

		return 1;
	}

	public static void main(String[] args)
	{
		int n1 = 20, n2 = 15;

		int gcd = findGcd(n1, n2);

		System.out.println("GCD of " + n1 + " and " + n2 + " is: " + gcd);
	}

}
