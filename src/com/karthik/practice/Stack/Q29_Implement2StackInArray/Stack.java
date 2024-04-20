package com.karthik.practice.Stack.Q29_Implement2StackInArray;

public class Stack
{
	int[] arr;
	int size, top1, top2;

	Stack(int n)
	{
		size = n;
		arr = new int[n];
		top1 = n / 2 + 1;
		top2 = n / 2;
	}

	void push1(int data)
	{
		if (top1 > 0)
		{
			top1--;
			arr[top1] = data;
		}
		else
		{
			System.out.println("Error");
			return;
		}
	}

	void push2(int data)
	{
		if (top2 < size - 1)
		{
			top2++;
			arr[top2] = data;
		}
		else
		{
			System.out.println("Error");
			return;
		}
	}

	int pop1()
	{
		if (top1 <= size / 2)
		{
			int x = arr[top1];
			top1++;
			return x;
		}
		else
			return -1;
	}

	int pop2()
	{
		if (top2 >= size / 2 + 1)
		{
			int x = arr[top2];
			top2--;
			return x;
		}
		else
			return -1;
	}

	public static void main(String[] args)
	{
		Stack ts = new Stack(5);
		ts.push1(5);
		ts.push2(10);
		ts.push2(15);
		ts.push1(11);
		ts.push2(7);
		System.out.println("Popped element from stack1 is " + ": " + ts.pop1());
		ts.push2(40);
		System.out.println("Popped element from stack2 is " + ": " + ts.pop2());
	}

}
