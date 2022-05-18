package problems.strings;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {

	public static void main(String[] args) {
		String inp = "rat";
		String out = "cart";
		boolean result = checkAnagram(inp, out);
		System.out.println("isAnagram? "+ result );
	}

	private static boolean checkAnagram(String inp, String out) {
		if(inp == null || out == null || inp.length() != out.length())
			return false;
		
		Map<Character,Integer> inpMap = new HashMap<>();
		for(char c : inp.toCharArray()) {
			inpMap.put(c, inpMap.getOrDefault(c, 0)+1);
		}
		int frequency = 0;
		for(char c : out.toCharArray()) {
			frequency = inpMap.getOrDefault(c, -1);
			if (frequency != -1) {
				if(frequency == 1) {
					inpMap.remove(c);
				}
				else {
					inpMap.put(c, inpMap.get(c) - 1);
				}
			}
		}
		return inpMap.isEmpty();
	}

}
