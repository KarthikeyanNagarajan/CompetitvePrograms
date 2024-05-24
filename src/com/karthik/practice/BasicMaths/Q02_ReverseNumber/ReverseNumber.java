package com.karthik.practice.BasicMaths.Q02_ReverseNumber;

public class ReverseNumber
{
	static void reverse(int n)
	{
		int revNum = 0;

		while (n > 0)
		{
			int ld = n % 10;
			revNum = (revNum * 10) + ld;
			n = n / 10;
		}
		System.out.println("Reversed N: " + revNum);
	}

	public static void main(String[] args)
	{
		int N = 329823;
		System.out.println("N: " + N);
		reverse(N);
	}

}
