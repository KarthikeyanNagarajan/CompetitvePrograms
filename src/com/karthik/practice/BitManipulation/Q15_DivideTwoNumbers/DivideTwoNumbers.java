package com.karthik.practice.BitManipulation.Q15_DivideTwoNumbers;

public class DivideTwoNumbers
{
	public static long func(int dividend, int divisor)
	{
		if (dividend == divisor)
			return 1;

		boolean sign = true;

		if (dividend >= 0 && divisor < 0)
			sign = false;
		else if (dividend <= 0 && divisor > 0)
			sign = false;

		long dv = Math.abs((long) dividend);
		long dr = Math.abs((long) divisor);
		divisor = Math.abs(divisor);

		long quotient = 0;

		while (dv >= dr)
		{
			int cnt = 0;
			while (dv >= (dr << (cnt + 1))) // Equivalent to dr * 2pow(cnt +1)
				cnt++;

			quotient += 1 << cnt; // Equivalent to 2pow(cnt)
			dv -= (dr << cnt); // Equivalent to dr * 2pow(cnt)
		}

		if (quotient == (1 << 31) && sign)
			return Integer.MAX_VALUE;

		if (quotient == (1 << 31) && !sign)
			return Integer.MIN_VALUE;

		return sign ? quotient : -quotient;
	}

	public static void main(String[] args)
	{
		// int dividend = 52, divisor = 4;
		int dividend = -2147483648, divisor = -1;
		System.out.println(func(dividend, divisor));
	}

}
