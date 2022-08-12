package problems.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveAnagrams {

	public static void main(String[] args) {
		//String[] strs = {"abba","baba","bbaa","cd","cd"};
		String[] strs = {"a","b","c","d","e"};
		System.out.println(Arrays.toString(strs));
		List<String> anaGroup = removeAnagrams(strs);
		System.out.println(Arrays.toString(anaGroup.toArray()));
	}

	public static List<String> removeAnagrams(String[] words) {
        List<String> result = new ArrayList<String>();
        
        String prev = "";
        for(int i=0; i<words.length; i++){
        	if(!checkifPreviousIsAAnagram(words[i], prev)) {
        		result.add(words[i]);
        	}
        	prev = words[i];
        }
        return result;
    }
    
    private static boolean checkifPreviousIsAAnagram(String s, String t){
         if(s == null || t == null || s.length() != t.length())
			return false;
		
		char[] sChar = s.toCharArray();
        Arrays.sort(sChar);
        char[] tChar = t.toCharArray();
        Arrays.sort(tChar);
	    //return String.valueOf(sChar).equals(String.valueOf(tChar));
        return  String.valueOf(getCharString(s.toCharArray()))
                .equals(
                String.valueOf(getCharString(t.toCharArray())));
    }
    
    private static String getCharString(char[] inp){
        char[] chInp = new char[26];
        for(char c : inp){
            chInp[c - 'a']++;
        }
        return String.valueOf(chInp);
    }
}
