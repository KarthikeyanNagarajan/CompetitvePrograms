package com.karthik.practice.Heap.Q08_SortNearlySortedArray;

import java.util.Iterator;
import java.util.PriorityQueue;

public class SortNearlySortedArray
{
	private static void kSort(int[] arr, int n, int k)
	{
		if (arr == null || n == 0)
		{
			return;
		}
		// min heap
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		// if there are less than k + 1 elements present in the array
		int minCount = Math.min(n, k + 1);
		// add first k + 1 items to the min heap
		for (int i = 0; i < minCount; i++)
		{
			heap.add(arr[i]);
		}

		int index = 0;
		// here even if size=k then n will be n=k,so i<n works fine
		for (int i = k + 1; i < n; i++)
		{
			arr[index++] = heap.peek();
			heap.poll();
			heap.add(arr[i]);
		}

		Iterator<Integer> itr = heap.iterator();

		while (itr.hasNext())
		{
			arr[index++] = heap.peek();
			heap.poll();
		}
	}

	private static void printArray(int[] arr, int n)
	{
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args)
	{
		int k = 3;
		int arr[] = { 2, 6, 3, 12, 56, 8 };
		int n = arr.length;

		kSort(arr, n, k);
		printArray(arr, n);
	}
}
