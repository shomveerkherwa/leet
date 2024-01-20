package problems.arrays;

import java.util.ArrayList;
import java.util.List;

public class PrintAllPossibilities {

	public static void main(String[] args) {
		int size = 3;
		List<String> result = new ArrayList<String>();
		getCombination("", result, size);
		result.stream().forEach(i -> System.out.println(i));
	}

	private static List<String> getCombination(String current, List<String> result, int size) {
		if(current.length() > size)
			return result;
		
		if(current.length() > 0)
			result.add(current);
		
		getCombination(current+0, result, size);
		getCombination(current+1, result, size);
		
		return result;
	}

}
