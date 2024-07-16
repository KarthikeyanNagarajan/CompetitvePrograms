package com.karthik.practice.BitManipulation.Q00_Basics;

public class ConvertDecimalToBinary
{
	public static String func(int n)
	{
		String res = "";

		while (n != 1)
		{
			if (n % 2 == 1)
				res += "1";
			else
				res += "0";

			n = n / 2;
		}
		res += "1";

		StringBuilder sb = new StringBuilder(res);
		sb.reverse();
		return sb.toString();
	}

	public static void main(String[] args)
	{
		int n = 13;
		System.out.println(func(n));
	}

}
