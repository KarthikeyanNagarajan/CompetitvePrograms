package com.karthik.practice.Recursion.Q37_PossibleWordsFromPhoneDigits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PossibleWordsFromPhoneDigits
{
	static Character[][] map;

	private static void generateMap()
	{
		map = new Character[10][5];
		map[0] = new Character[] { '\0' };
		map[1] = new Character[] { '\0' };
		map[2] = new Character[] { 'a', 'b', 'c' };
		map[3] = new Character[] { 'd', 'e', 'f' };
		map[4] = new Character[] { 'g', 'h', 'i' };
		map[5] = new Character[] { 'j', 'k', 'l' };
		map[6] = new Character[] { 'm', 'n', 'o' };
		map[7] = new Character[] { 'p', 'q', 'r', 's' };
		map[8] = new Character[] { 't', 'u', 'v' };
		map[9] = new Character[] { 'w', 'x', 'y', 'z' };
	}

	private static List<String> printWords(int ind, String s, int[] arr, int n)
	{
		if (ind == n)
			return new ArrayList<>(Collections.singleton(s));

		List<String> list = new ArrayList<>();

		for (int i = 0; i < map[arr[ind]].length; i++)
		{
			String sCopy = String.copyValueOf(s.toCharArray());
			sCopy = sCopy.concat(map[arr[ind]][i].toString());
			list.addAll(printWords(ind + 1, sCopy, arr, n));
		}
		return list;
	}

	public static void main(String[] args)
	{
		int arr[] = { 2, 3, 4 };
		int n = arr.length;

		generateMap();

		List<String> stringList = printWords(0, "", arr, n);

		stringList.stream().forEach(System.out::println);
	}

}
