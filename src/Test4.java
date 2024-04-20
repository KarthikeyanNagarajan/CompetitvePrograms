import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test4
{

	public static void main(String[] args)
	{
		int[][] people = { { 7, 0 }, { 4, 4 }, { 7, 1 }, { 5, 0 }, { 6, 1 }, { 5, 2 } };
		List<int[]> ans = new ArrayList<>();
		Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);
		Arrays.stream(people).forEach(i-> {Arrays.stream(i).forEach(System.out::print); System.out.println();});
		
		for(int[] p : people)
        {
            ans.add(p[1], p);
        }
		System.out.println(ans);
	}

}
