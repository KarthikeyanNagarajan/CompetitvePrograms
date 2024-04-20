package com.karthik.practice.Arrays.Q13_MergeIntervals;

import java.util.Arrays;
import java.util.Comparator;

public class WithConstantSpaceClass
{
	static class Pair
	{
		int first, second;

		Pair(int first, int second)
		{
			this.first = first;
			this.second = second;
		}
	}

	public static void WithConstantSpaceMethod(Pair[] arr, int n)
	{
		Arrays.sort(arr, new Comparator<Pair>()
		{
			public int compare(Pair i1, Pair i2)
			{
				return i1.first - i2.first;
			}
		});
		int index = 0;
		for (int i = 1; i < n; i++)
		{
			if (arr[index].second >= arr[i].first)
			{
				arr[index].second = Math.max(arr[index].second, arr[i].second);
			}
			else
			{
				index++;
				arr[index] = arr[i];
			}
		}

		Arrays.stream(arr).limit(index + 1).forEach(i -> System.out.println(i.first + "," + i.second));
	}

	public static void main(String[] args)
	{
		Pair arr[] = new Pair[3];
		arr[0] = new Pair(1, 3);
		arr[1] = new Pair(2, 4);
		arr[2] = new Pair(5, 8);
		WithConstantSpaceMethod(arr, arr.length);
	}

}
