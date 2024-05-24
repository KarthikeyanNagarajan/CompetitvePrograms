package com.karthik.practice.BasicMaths.Q05_PrintAllDivisors;

public class BruteMethod
{
	public static int[] printDivisors(int n, int[] size)
	{
		int[] divisors = new int[n];

		int count = 0;
		for (int i = 1; i <= n; i++)
		{
			if (n % i == 0)
			{
				divisors[count++] = i;
			}
		}

		size[0] = count;

		return divisors;
	}

	public static void main(String[] args)
	{
		int number = 12;
		int[] size = new int[1];

		int[] divisors = printDivisors(number, size);

		System.out.print("Divisors of " + number + " are: ");
		for (int i = 0; i < size[0]; i++)
			System.out.print(divisors[i] + " ");
		System.out.println();

		divisors = null;
	}

}
