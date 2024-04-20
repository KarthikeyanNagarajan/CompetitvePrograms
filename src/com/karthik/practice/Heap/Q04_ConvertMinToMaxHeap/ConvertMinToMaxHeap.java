package com.karthik.practice.Heap.Q04_ConvertMinToMaxHeap;

public class ConvertMinToMaxHeap
{
	static void MaxHeapify(int arr[], int i, int N)
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
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			MaxHeapify(arr, largest, N);
		}
	}

	static void convertMaxHeap(int arr[], int N)
	{
		for (int i = (N - 2) / 2; i >= 0; --i)
			MaxHeapify(arr, i, N);
	}

	static void printArray(int arr[], int size)
	{
		for (int i = 0; i < size; ++i)
			System.out.print(arr[i] + " ");
	}

	public static void main(String[] args)
	{
		int arr[] = { 3, 5, 9, 6, 8, 20, 10, 12, 18, 9 };
		int N = arr.length;

		System.out.print("Min Heap array : ");
		printArray(arr, N);

		convertMaxHeap(arr, N);

		System.out.print("\nMax Heap array : ");
		printArray(arr, N);
	}
}
