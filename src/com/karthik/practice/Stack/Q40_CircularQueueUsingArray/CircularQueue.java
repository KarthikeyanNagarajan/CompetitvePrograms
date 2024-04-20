package com.karthik.practice.Stack.Q40_CircularQueueUsingArray;

public class CircularQueue
{
	static int[] arr;
	static int front = 0, rear = -1, len = 0;

	public CircularQueue(int k)
	{
		arr = new int[k];
	}

	static boolean enqueue(int data)
	{
		if (!isFull())
		{
			rear = (rear + 1) % arr.length;
			arr[rear] = data;
			len++;
			return true;
		}
		else
			return false;
	}

	static boolean dequeue()
	{
		if (!isEmpty())
		{
			front = (front + 1) % arr.length;
			len--;
			return true;
		}
		else
			return false;
	}

	static int getFront()
	{
		return isEmpty() ? -1 : arr[front];
	}

	static int getRear()
	{
		return isEmpty() ? -1 : arr[rear];
	}

	static boolean isEmpty()
	{
		return len == 0;
	}

	static boolean isFull()
	{
		return len == arr.length;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

}
