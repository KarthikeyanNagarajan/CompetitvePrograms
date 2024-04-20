import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test
{
	public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Long> map = Arrays.stream(nums).boxed().collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
        List<Integer> ls = new ArrayList<>();
        System.out.println(map);
        map.entrySet().stream().filter(i -> i.getValue() > 1).forEach(i -> ls.add(i.getKey()));
        if(ls.size() > 0)
            return true;
        return false;
    }
	
	public static boolean containsDuplicate1(int[] nums) {
        int len = nums.length;
        for(int i = 0; i < len; i++)
        {
            nums[nums[i] % len] = nums[nums[i] % len] + len;
        }
        for(int i = 0; i < len; i++)
        {
        	System.out.println(nums[i]/ len);
            if(nums[i] / len > 1)
                return true;
        }
        return false;
    }
	public static void main(String[] args)
	{
		int[] nums = {1,2,3,4};
		int mid = (0 + 1) / 2;
		System.out.println(mid);
		System.out.println(containsDuplicate1(nums));
	}

}
