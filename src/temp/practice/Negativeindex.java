package temp.practice;

public class Negativeindex
{

	static void printFirstNegativeInteger(int arr[], int k, int n)
	{
		int firstNegativeIndex = 0;
		int firstNegativeElement;

		for (int i = k - 1; i < n; i++)
		{
			// Skip out of window and positive elements
			while ((firstNegativeIndex < i) && (firstNegativeIndex <= i - k || arr[firstNegativeIndex] >= 0))
				firstNegativeIndex++;

			// Check if a negative element is found, otherwise use 0
			if (arr[firstNegativeIndex] < 0)
				firstNegativeElement = arr[firstNegativeIndex];
			else
				firstNegativeElement = 0;
			System.out.print(firstNegativeElement + " ");
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		int arr[] = { 12, -1, -7, 8, -15, 30, 16, 28 };
		int n = arr.length;
		int k = 3;

		printFirstNegativeInteger(arr, k, n);
	}
}

// This code is contributed by amreshkumar3
