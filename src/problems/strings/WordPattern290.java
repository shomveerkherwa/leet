package problems.strings;

import java.util.HashMap;
import java.util.Map;

public class WordPattern290 {

	public static void main(String[] args) {
		String pattern = "abba";
		String s = "dog cat cat dog";
		System.out.println(wordPattern(pattern, s));
	}

	public static boolean wordPattern(String pattern, String s) {
		String[] words = s.split(" ");
	    if (words.length != pattern.length())
	        return false;
	    Map index = new HashMap();
	    for (Integer i=0; i<words.length; ++i)
	        if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
	            return false;
	    return true;
    }
}
