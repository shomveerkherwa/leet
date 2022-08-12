package problems.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {

	public static void main(String[] args) {
	String s = "abab";
	String p = "ab";
	List<Integer> indexes = findAnagrams(s,p);
		indexes.stream().forEach(e -> System.out.println(e));
	}

	public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> indexes = new ArrayList<>();
        int pSize = p.length();
        int sSize = s.length();
        int limit = sSize-pSize;
        for(int i=0; i<=limit; i++) {
        	String newInp = s.substring(i, i+pSize);
        	if(checkAnagram(newInp,p))
        		indexes.add(i);
        }
        return indexes;
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
