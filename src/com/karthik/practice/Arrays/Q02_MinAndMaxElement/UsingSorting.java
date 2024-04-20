package com.karthik.practice.Arrays.Q02_MinAndMaxElement;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UsingSorting
{
	public static void main(String[] args)
	{
		List<Integer> ls = Arrays.asList(5, 8, 3, 9, 2, 0, 7, 1);
		Collections.sort(ls);
		System.out.println("Min Element : " + ls.get(0));
		System.out.println("Max Element : " + ls.get(ls.size() - 1));
	}

}
