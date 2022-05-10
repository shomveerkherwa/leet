package problems;

import java.util.HashSet;
import java.util.Set;

public class _3_Longest_substring {

	public static void main(String[] args) {
		String input = "dvdf";
		System.out.println(input);
		System.out.println("Longest Sub-String "+ calculateLongestSubString(input));
	}

	private static int calculateLongestSubString(String input) {
		int maxLength = 0;
		int size = input.length();
		
		if(input == null || size < 0) {
			return maxLength;
		}
		
		Set<Character> charSet = new HashSet<Character>();
		char[] charArray = input.toCharArray();
		int start = 0;
  		int end = 0;
  		int length = 0;
		while(end < size) {
			// get next character;
			char c = charArray[end];
			
			//  move the left pointer untill we have not gotten rid of the duplicate
			while(charSet.contains(c)) {
				charSet.remove(charArray[start++]);
			}
			
			// right pointer always moves ahead
			end++;
			charSet.add(c);
			length = end-start;
			maxLength = Math.max(length, maxLength);
		}
		return maxLength;
	}

}
