package problems.strings;

import java.util.Arrays;

public class IsAnagramUseSort {

	public static void main(String[] args) {
		String inp = "tar";
		String out = "rat";
		boolean result = checkAnagram(inp, out);
		System.out.println("isAnagram? "+ result );

	}

	private static boolean checkAnagram(String s, String t) {
		if(s == null || t == null || s.length() != t.length())
			return false;
		
		char[] sChar = s.toCharArray();
        Arrays.sort(sChar);
        char[] tChar = t.toCharArray();
        Arrays.sort(tChar);
	    return String.valueOf(sChar).equals(String.valueOf(tChar));
    }
	
}
