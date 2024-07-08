package com.karthik.practice.Greedy.Q06_JobSequencingProblem;

import java.util.Arrays;
import java.util.Comparator;

class Job
{
	int id;
	int deadline;
	int profit;

	Job()
	{

	}

	Job(int id, int deadline, int profit)
	{
		this.id = id;
		this.deadline = deadline;
		this.profit = profit;
	}
}

class ProfitCompare implements Comparator<Job>
{

	@Override
	public int compare(Job j1, Job j2)
	{
		if (j1.profit == j2.profit)
			return 0;
		else if (j1.profit < j2.profit)
			return 1;
		else
			return -1;
	}
}

public class JobSequencingProblem
{

	public static int func(Job[] arr, int n)
	{
		Arrays.sort(arr, new ProfitCompare());

		int totalProfit = 0, cnt = 0, maxDeadline = 0;
		for (int i = 0; i < n; i++)
		{
			maxDeadline = Math.max(maxDeadline, arr[i].deadline);
		}

		int[] temp = new int[maxDeadline + 1];
		Arrays.fill(temp, -1);

		for (int i = 0; i < n; i++)
		{
			for (int j = arr[i].deadline; j >= 0; i--)
			{
				if (temp[j] == -1)
				{
					cnt++;
					temp[j] = arr[i].id;
					totalProfit += arr[i].profit;
					break;
				}
			}
		}

		return totalProfit;
	}

	public static void main(String[] args)
	{
		Job j1 = new Job(1, 4, 20);
		Job j2 = new Job(2, 5, 60);
		Job j3 = new Job(3, 6, 70);
		Job j4 = new Job(4, 6, 65);
		Job j5 = new Job(5, 4, 25);
		Job j6 = new Job(6, 2, 80);
		Job j7 = new Job(7, 2, 10);
		Job j8 = new Job(8, 2, 22);

		Job[] arr = { j1, j2, j3, j4, j5, j6, j7, j8 };
		int n = arr.length;
		System.out.println(func(arr, n));

	}

}
