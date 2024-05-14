package com.karthik.practice.BinarySearch.Q27_KthElementOf2SortedArray;

public class KthElementOf2SortedArray
{

	private static int kthelement(int[] arr1, int[] arr2, int n1, int n2, int k)
	{
		if (n1 > n2)
			return kthelement(arr2, arr1, n2, n1, k);

		int low = Math.max(0, k - n1);
		int high = Math.min(k, n2);

		while (low <= high)
		{
			int mid1 = (low + high) >> 1;
			int mid2 = k - mid1;

			int l1 = mid1 == 0 ? Integer.MIN_VALUE : arr1[mid1 - 1];
			int l2 = mid2 == 0 ? Integer.MIN_VALUE : arr2[mid2 - 1];
			int r1 = mid1 == n2 ? Integer.MAX_VALUE : arr1[mid1];
			int r2 = mid2 == n1 ? Integer.MAX_VALUE : arr2[mid2];

			if (l1 <= r2 && l2 <= r1)
				return Math.max(l1, l2);
			else if (l1 > r2)
				high = mid1 - 1;
			else
				low = mid1 + 1;
		}
		return -1;
	}

	public static void main(String[] args)
	{
		int arr1[] = { 2, 3, 6, 7, 9 };
		int arr2[] = { 1, 4, 8, 10 };
		int n1 = arr1.length;
		int n2 = arr2.length;
		int k = 5;
		System.out.println("The element at the kth position is " + kthelement(arr1, arr2, n1, n2, k));
	}

}
