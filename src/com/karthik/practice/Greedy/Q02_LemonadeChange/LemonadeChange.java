package com.karthik.practice.Greedy.Q02_LemonadeChange;

public class LemonadeChange
{
	public static boolean func(int[] bills, int n)
	{
		int five = 0, ten = 0;
		for (int i = 0; i < n; i++)
		{
			if (bills[i] == 5)
				five += 1;
			else if (bills[i] == 10)
			{
				if (five > 0)
				{
					five -= 1;
					ten += 1;
				}
				else
					return false;
			}
			else
			{
				if (five > 0 && ten > 0)
				{
					five -= 1;
					ten -= 1;
				}
				else if (five > 2)
					five -= 3;
				else
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		int n = 5;
		int[] bills = { 5, 5, 5, 10, 20 };

		System.out.println(func(bills, n));
	}

}
