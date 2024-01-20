package utility;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CheckToString {

	public static void main(String[] args) {
		String inp ="(())";
		System.out.println(inp);
		char[] inpArray = inp.toCharArray();
		System.out.println(Arrays.toString(inpArray));
		Set<String> set = null;
		List<String> list = set.stream().map(e -> e).collect(Collectors.toList());
		Collections.max(set);
	}

}
