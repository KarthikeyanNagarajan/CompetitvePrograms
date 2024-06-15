package com.karthik.practice.Recursion.Q32_GenerateBinaryStringOfNBits;

import java.util.Arrays;

public class GenerateBinaryStringOfNBits
{
	public static void printTheArray(int arr[])
	{
		Arrays.stream(arr).forEach(i -> System.out.print(i + " "));		
		System.out.println();
	}

	public static void generateAllBinaryStrings(int n, int arr[], int i)
	{
		if (i == n) 
	    {
	        printTheArray(arr);
	        return;
	    }
	 
	    // First assign "0" at ith position
	    // and try for all other permutations
	    // for remaining positions
	    arr[i] = 0;
	    generateAllBinaryStrings(n, arr, i + 1);
	 
	    // And then assign "1" at ith position
	    // and try for all other permutations
	    // for remaining positions
	    arr[i] = 1;
	    generateAllBinaryStrings(n, arr, i + 1);
	}

	public static void main(String[] args)
	{
		int n = 4;
		int[] arr = new int[n];
		generateAllBinaryStrings(n, arr, 0);
	}

}
