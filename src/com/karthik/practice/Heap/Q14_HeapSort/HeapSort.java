package com.karthik.practice.Heap.Q14_HeapSort;

public class HeapSort
{
	public void sort(int arr[], int N)
	{
		// Build heap (rearrange array)
		for (int i = N / 2 - 1; i >= 0; i--)
			heapify(arr, N, i);

		// One by one extract an element from heap
		for (int i = N - 1; i > 0; i--)
		{
			// Move current root to end
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			// call max heapify on the reduced heap
			heapify(arr, i, 0);
		}
	}

	void heapify(int arr[], int N, int i)
	{
		int largest = i;
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		if (l < N && arr[l] > arr[largest])
			largest = l;

		if (r < N && arr[r] > arr[largest])
			largest = r;

		if (largest != i)
		{
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
			heapify(arr, N, largest);
		}
	}

	static void printArray(int arr[], int N)
	{
		for (int i = 0; i < N; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[])
	{
		int arr[] = { 12, 11, 13, 5, 6, 7 };
		int N = arr.length;

		HeapSort ob = new HeapSort();
		ob.sort(arr, N);

		System.out.println("Sorted array is");
		printArray(arr, N);
	}
}
