package com.karthik.practice.Heap.Q17_MergeTwoMaxHeap;

public class MergeTwoMaxHeap
{
	public static void maxHeapify(int[] arr, int N, int i)
	{
		if (i >= N)
		{
			return;
		}
		int l = i * 2 + 1;
		int r = i * 2 + 2;
		int max;
		if (l < N && arr[l] > arr[i])
		{
			max = l;
		}
		else
			max = i;
		if (r < N && arr[r] > arr[max])
		{
			max = r;
		}

		if (max != i)
		{
			int temp = arr[max];
			arr[max] = arr[i];
			arr[i] = temp;
			maxHeapify(arr, N, max);
		}
	}

	public static void mergeHeaps(int[] arr, int[] a, int[] b, int N, int M)
	{
		for (int i = 0; i < N; i++)
		{
			arr[i] = a[i];
		}
		for (int i = 0; i < M; i++)
		{
			arr[N + i] = b[i];
		}
		N = N + M;

		// Builds a max heap
		for (int i = N / 2 - 1; i >= 0; i--)
		{
			maxHeapify(arr, N, i);
		}
	}

	public static void main(String[] args)
	{
		int[] a = { 10, 5, 6, 2 };
		int[] b = { 12, 7, 9 };
		int N = a.length;
		int M = b.length;

		int[] merged = new int[M + N];

		mergeHeaps(merged, a, b, N, M);

		for (int i = 0; i < M + N; i++)
			System.out.print(merged[i] + " ");
		System.out.println();
	}
}
