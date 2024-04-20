package com.karthik.practice.SortingAlgorithms;

import java.util.Collections;
import java.util.Vector;

public class Q8_BucketSort
{
	static void sort(float[] arr, int n)
	{
		if (n <= 0)
			return;
		@SuppressWarnings("unchecked")
		Vector<Float>[] buckets = new Vector[n];
		for (int i = 0; i < n; i++)
		{
			buckets[i] = new Vector<Float>();
		}
		for (int i = 0; i < n; i++)
		{
			float idx = arr[i] * n;
			buckets[(int) idx].add(arr[i]);
		}
		for (int i = 0; i < n; i++)
		{
			Collections.sort(buckets[i]);
		}
		int index = 0;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < buckets[i].size(); j++)
			{
				arr[index++] = buckets[i].get(j);
			}
		}
	}

	public static void main(String[] args)
	{
		float arr[] = { (float) 0.897, (float) 0.565, (float) 0.656, (float) 0.1234, (float) 0.665, (float) 0.3434 };
		sort(arr, arr.length);
		for (float el : arr)
		{
			System.out.print(el + " ");
		}
	}

}
