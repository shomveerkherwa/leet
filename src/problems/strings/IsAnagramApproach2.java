package problems.strings;

import java.util.HashMap;
import java.util.Map;

public class IsAnagramApproach2 {

	public static void main(String[] args) {
		String inp = "rat";
		String out = "car";
		boolean result = checkAnagram(inp, out);
		System.out.println("isAnagram? "+ result );
	}

	private static boolean checkAnagram(String inp, String out) {
		if(inp == null || out == null || inp.length() != out.length())
			return false;
		
		int[] alphabets = new int[26];
		
		for(char c : inp.toCharArray())
			alphabets[c-'a']++;
		
		for(char c : out.toCharArray())
			alphabets[c-'a']--;
		
		for(int i=0;i<26;i++) {
			if(alphabets[i] != 0)
				return false;
		}
		
		return true;
	}

}
