package com.karthik.practice.Arrays.Q18_FactorialOfLargeNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UsingList
{
	public static void UsingListMethod(int n)
	{
		List<Integer> ls = new ArrayList<>();
		ls.add(1);
		int val = 0, carry = 0;
		for (int i = 2; i <= n; i++)
		{
			carry = 0;
			for (int j = 0; j < ls.size(); j++)
			{
				val = i * ls.get(j) + carry;
				ls.set(j, val % 10);
				carry = val / 10;
			}
			if (carry != 0)
			{
				ls.add(carry % 10);
				carry /= 10;
			}
		}

		Collections.reverse(ls);
		ls.stream().forEach(i -> System.out.print(i));
	}

	public static void main(String[] args)
	{
		int n = 10; //ans = 3628800
		UsingListMethod(n);

	}

}
