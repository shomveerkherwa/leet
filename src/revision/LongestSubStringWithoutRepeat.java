package revision;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeat {

	public static void main(String[] args) {
		String s="pwwkew";
		//String s = "abcabcbb";
		//String s = "dvdf";
		System.out.println(s +" "+lengthOfLongestSubstring(s));
	}
	
	public static int lengthOfLongestSubstring(String s) {
		Set<Character> unique = new HashSet<>();
		int maxLength = 0;
		int currLength = 0;
		int left = 0;
		int right = 0;
		char[] input = s.toCharArray();
		int size = input.length;
		for(; left< size && right < size; right++) {
			char cur = input[right];
			if(unique.contains(cur)) {
				unique.remove(input[left]);
				left++;
			}
			unique.add(cur);
            currLength = right-left+1;
			maxLength = Math.max(maxLength, currLength);
		}
		return maxLength;
    }

}
