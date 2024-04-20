import java.util.Map;
import java.util.TreeMap;

public class Test3
{

	public static void main(String[] args)
	{
		int start = 0, end = 0;
		Map<Integer, Integer> map = new TreeMap<>();
		map.merge(start, 1, Integer::sum);
		map.merge(end, -1, Integer::sum);
	}

}
