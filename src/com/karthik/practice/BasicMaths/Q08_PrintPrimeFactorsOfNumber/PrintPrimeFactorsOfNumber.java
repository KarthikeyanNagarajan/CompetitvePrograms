package com.karthik.practice.BasicMaths.Q08_PrintPrimeFactorsOfNumber;

import java.util.ArrayList;
import java.util.List;

public class PrintPrimeFactorsOfNumber
{
	static List<Integer> printPrimeFactors(int n)
	{
		List<Integer> list = new ArrayList<>();
		for (int i = 2; i <= Math.sqrt(n); i++)
		{
			if (n % i == 0)
			{
				list.add(i);
				while (n % i == 0)
					n = n / i;
			}
		}
		if (n != 1)
			list.add(n);

		return list;
	}

	public static void main(String[] args)
	{
		int n = 36;

		System.out.println(printPrimeFactors(n));

	}

}
