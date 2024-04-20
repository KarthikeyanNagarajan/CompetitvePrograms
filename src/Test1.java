import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Test1
{
	public static int[] intersect(int[] nums1, int[] nums2)
	{
		Arrays.sort(nums1);
		Set<Integer> collect = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
		Set<Integer> resultSet = new HashSet<>();
		for (int num : collect)
		{
			if (binarySearch(nums1, num))
				resultSet.add(num);
		}

		int[] result = new int[resultSet.size()];
		int i = 0;
		for (int num : resultSet)
		{
			result[i++] = num;
		}
		return result;
	}

	public static boolean binarySearch(int[] nums1, int num)
	{
		int low = 0, high = nums1.length - 1;
		while (low <= high)
		{
			int mid = (low + high) / 2;
			if (nums1[mid] == num)
				return true;

			if (nums1[mid] < num)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return false;
	}

	public static void main(String[] args)
	{
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		int[] intersect = intersect(nums1, nums2);
		Arrays.stream(intersect).forEach(i -> System.out.print(i + " "));
	}
}
