package com.karthik.practice.Recursion.Q35_MoveAllXToEndOfString;

public class MoveAllXToEndOfString
{
	private static void moveAtEnd(String s, int i, int len)
	{
		if (i >= len)
			return;

		char curr = s.charAt(i);

		if (curr != 'x')
			System.out.print(curr);

		moveAtEnd(s, i + 1, len);

		if (curr == 'x')
			System.out.print(curr);
	}

	public static void main(String[] args)
	{
		String s = "geekxsforgexxeksxx"; // ans = geeksforgeeksxxxxx
		int len = s.length();
		moveAtEnd(s, 0, len);
	}

}
