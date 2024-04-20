package com.karthik.practice.Arrays.Q57_PascalElementPrint;

import java.util.stream.IntStream;

public class PascalElementPrint
{
	public static void PascalElementPrintMethod(int a, int b)
	{		
		int numerator = IntStream.rangeClosed(2, a - 1).reduce(1, (x, y) -> x * y);
		int denominator = IntStream.rangeClosed(2, b - 1).reduce(1, (x, y) -> x * y);
		int ans = numerator / denominator;
		System.out.println(ans);
	}

	public static void main(String[] args)
	{
		int a = 3;
		int b = 2;
		PascalElementPrintMethod(a, b);
	}

}
