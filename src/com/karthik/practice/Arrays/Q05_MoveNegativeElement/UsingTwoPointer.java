package com.karthik.practice.Arrays.Q05_MoveNegativeElement;

public class UsingTwoPointer
{
	private static int[] UsingTwoPointerMethod(int[] arr, int n)
	{
		int low = 0, high = n - 1;
		while (low <= high)
		{
			if (arr[low] < 0 && arr[high] < 0)
			{
				low++;
			}
			else if (arr[low] < 0 && arr[high] >= 0)
			{
				low++;
				high--;
			}
			else if (arr[low] >= 0 && arr[high] < 0)
			{
				int tmp1 = arr[low];
				arr[low] = arr[high];
				arr[high] = tmp1;
				low++;
				high--;
			}
			else
			{
				high--;
			}
		}
		return arr;
	}

	public static void main(String[] args)
	{
//		int[] arr = { -1, 2, 0, 3, 7, -2, 1, -1, 5, 0, 6, -8, 0, 7, 2, -9, 0 };
		int[] arr = { -1, 2, 1, 3, 7, -2, 1, -1, 5, 2, 6, -8, 3, 7, 2, -9, 4 };
		int[] ans = UsingTwoPointerMethod(arr, arr.length);
		for (int a : ans)
			System.out.print(a + " ");
	}

}
