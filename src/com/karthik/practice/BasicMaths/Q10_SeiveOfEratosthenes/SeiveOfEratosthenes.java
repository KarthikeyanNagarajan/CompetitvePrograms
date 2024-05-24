package com.karthik.practice.BasicMaths.Q10_SeiveOfEratosthenes;

public class SeiveOfEratosthenes
{
	static void seiveOfEratosthenes(int n)
	{
		int[] prime = new int[n + 1];

		for (int i = 2; i <= n; i++)
			prime[i] = 1;

		for (int i = 2; i * i <= n; i++)
			if (prime[i] == 1)
				for (int j = i * i; j <= n; j += i)
					prime[j] = 0;

		for (int i = 2; i < n; i++)
			if (prime[i] == 1)
				System.out.print(i + " ");
	}

	public static void main(String[] args)
	{
		int n = 35;
		seiveOfEratosthenes(n);
	}

}
