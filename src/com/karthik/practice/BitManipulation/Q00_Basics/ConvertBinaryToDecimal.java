package com.karthik.practice.BitManipulation.Q00_Basics;

public class ConvertBinaryToDecimal
{
	public static int func(String binary)
	{
		int n = binary.length();
		int p2 = 1, num = 0;

		for (int i = n - 1; i >= 0; i--)
		{
			if (binary.charAt(i) == '1')
				num = num + p2;

			p2 = p2 * 2;
		}
		return num;
	}

	public static void main(String[] args)
	{
		String n = "1101";
		System.out.println(func(n));
	}

}
