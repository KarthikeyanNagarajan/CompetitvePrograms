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
		
	}

	public static void main(String[] args)
	{
		int n = 4;
		int[] arr = new int[n];
		generateAllBinaryStrings(n, arr, 0);
	}

}
