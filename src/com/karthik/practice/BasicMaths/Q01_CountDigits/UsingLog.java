package com.karthik.practice.BasicMaths.Q01_CountDigits;

public class UsingLog
{
	static int countDigits(int n)
	{
		int cnt = (int) (Math.log10(n) + 1);

		return cnt;
	}

	public static void main(String[] args)
	{
		int N = 329823;
		System.out.println("N: " + N);
		int digits = countDigits(N);
		System.out.println("Number of Digits in N: " + digits);
	}

}
