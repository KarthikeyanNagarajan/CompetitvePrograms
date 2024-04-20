package com.karthik.practice.Stack.Q44_TourVisitsAllPetrolPump;

public class TourPetrolPump
{
	static class PetrolPump
	{
		int petrol, distance;

		PetrolPump(int petrol, int distance)
		{
			this.petrol = petrol;
			this.distance = distance;
		}
	}

	static int printTour(PetrolPump[] p, int n)
	{
		int start = 0, deficit = 0, capacity = 0;
		for (int i = 0; i < n; i++)
		{
			capacity += p[i].petrol - p[i].distance;
			if (capacity < 0)
			{
				start = i + 1;
				deficit += capacity;
				capacity = 0;
			}
		}
		return (capacity + deficit >= 0) ? start : -1;
	}

	public static void main(String[] args)
	{
		PetrolPump arr[] = { new PetrolPump(6, 4), new PetrolPump(3, 6), new PetrolPump(7, 3) };

		int n = arr.length;
		int start = printTour(arr, n);

		if (start == -1)
			System.out.print("No solution");
		else
			System.out.print("Start = " + start);
	}

}
