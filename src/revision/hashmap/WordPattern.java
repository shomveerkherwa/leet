package revision.hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordPattern {

	public static void main(String[] args) {
		String pattern = "abba";
		String s = "dog cat cat dog";
		System.out.println(wordPattern2(pattern, s));
	}
	
	 public static boolean wordPattern(String pattern, String s) {
	     char[] pat = pattern.toCharArray();
	     String[] sArray = s.split(" ");
	     if(pat.length != sArray.length)
	    	 return false;
	     
	     Map<Character,String> map = new HashMap<Character,String>();
	     Set<String> dupCheck = new HashSet<String>();
		 for(int i=0; i<pat.length; i++) {
			 char c = pat[i];
			 String val = sArray[i];
			 
			 if(map.get(c) != null && !map.get(c).equals(val))
				 return false;
			 else if(map.get(c) == null && dupCheck.contains(val))
				 return false;
			 else {
				 map.put(c, val);
				 dupCheck.add(val);
			 }
		}
	     return true; 
	 }
	 
	 public static boolean wordPattern2(String pattern, String str) {
		    String[] words = str.split(" ");
		    if (words.length != pattern.length())
		        return false;
		    Map index = new HashMap();
		    for (Integer i=0; i<words.length; ++i)
		        if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
		            return false;
		    return true;
		}
}
