package problems.strings;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesisOwn {

	public static void main(String[] args) {
		int n = 3;
		List<String> pattern = generateParanthesis(n);
		System.out.println(pattern.size());
		pattern.stream().forEach(e -> System.out.println(e));
	}

	private static List<String> generateParanthesis(int n) {
		List<String> result = new ArrayList<String>();
		helper(result, "", 0, 0, n);
		return result;
	}

	private static void helper(List<String> result, String current, int open, int close, int n) {
		if(current.length() == n*2 ) {
			result.add(current);
			return;
		}
		if(open < n)
			helper(result, current+"(", open+1, close, n);
		if(close < open)
			helper(result, current+")", open, close+1, n);
	}

}
