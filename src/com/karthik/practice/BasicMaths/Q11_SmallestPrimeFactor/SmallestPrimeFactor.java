package com.karthik.practice.BasicMaths.Q11_SmallestPrimeFactor;

public class SmallestPrimeFactor
{
	static void smallestPrimeFactor(int n, int[] queries)
	{
		int[] spf = new int[n + 1];

		for (int i = 2; i <= n; i++)
			spf[i] = 1;

		for (int i = 2; i * i <= n; i++)
			if (spf[i] == 1)
				for (int j = i * i; j <= n; j += i)
					if (spf[j] == j)
						spf[j] = i;

		for (int i = 0; i < queries.length; i++)
		{
			int num = queries[i];

			while (num != 1)
			{
				System.out.print(spf[num] + " ");
				num = num / spf[num];
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		int n = 35;
		int[] queries = { 35, 40, 45 };
		smallestPrimeFactor(n, queries);
	}

}
