package com.karthik.practice.Arrays.Q01_ReverseAnArray;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsingCollection
{
	public static void main(String[] args)
	{
		List<Integer> ls = Arrays.asList(5, 8, 3, 9, 2, 0, 7, 1);
		Collections.reverse(ls);
		System.out.println(ls);
	}

}
