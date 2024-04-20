package com.karthik.practice.Graph.Q30_WordLadder1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class Pair
{
	String first;
	int second;

	Pair(String _first, int _second)
	{
		this.first = _first;
		this.second = _second;
	}
}

public class WordLadder1
{

	public int wordLadderLength(String startWord, String targetWord, String[] wordList)
	{
		Queue<Pair> q = new LinkedList<>();
		q.add(new Pair(startWord, 1));

		Set<String> st = new HashSet<String>();

		int len = wordList.length;
		for (int i = 0; i < len; i++)
		{
			st.add(wordList[i]);
		}
		st.remove(startWord);
		while (!q.isEmpty())
		{
			String word = q.peek().first;
			int steps = q.peek().second;
			q.remove();

			if (word.equals(targetWord))
				return steps;

			for (int i = 0; i < word.length(); i++)
			{
				for (char ch = 'a'; ch <= 'z'; ch++)
				{
					char replacedCharArray[] = word.toCharArray();
					replacedCharArray[i] = ch;
					String replacedWord = new String(replacedCharArray);

					// check if it exists in the set and push it in the queue.
					if (st.contains(replacedWord))
					{
						st.remove(replacedWord);
						q.add(new Pair(replacedWord, steps + 1));
					}
				}

			}
		}
		// If there is no transformation sequence possible
		return 0;
	}

	public static void main(String[] args)
	{
		String startWord = "der", targetWord = "dfs";
		String[] wordList = { "des", "der", "dfr", "dgt", "dfs" };

		WordLadder1 obj = new WordLadder1();
		int ans = obj.wordLadderLength(startWord, targetWord, wordList);

		System.out.print(ans);

		System.out.println();
	}

}
