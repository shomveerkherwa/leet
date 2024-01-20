package revision.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupAnangrams {

	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		//String[] strs = {"a","a"};
		List<List<String>> result = groupAnagramsAgain(strs);
		for(List<String> batch : result) {
			System.out.println(Arrays.toString(batch.toArray()));
		}
	}
	
	public static List<List<String>> groupAnagramsAgain(String[] strs){
		if (strs == null || strs.length == 0) 
        	return new ArrayList<>();
		
		Map<String,List<String>> map = new HashMap<>();
		for(String s : strs) {
			char[] val = new char[26];
			for(char c : s.toCharArray()) {
				val[c-'a']++;
			}
			String keyStr = String.valueOf(val);
			if(!map.containsKey(keyStr))
				map.put(keyStr, new ArrayList<>());
			map.get(keyStr).add(s);
		}
		return new ArrayList<>(map.values());
	}
	
	public static List<List<String>> groupAnagrams2(String[] strs) {
        if (strs == null || strs.length == 0) 
        	return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = new char[26];
            for (char c : s.toCharArray()) 
            	ca[c - 'a']++;
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) 
            	map.put(keyStr, new ArrayList<>());
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }
	
	public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Set<String> collected = new HashSet();
        for(int i=0; i< strs.length; i++) {
        	List<String> batch = new ArrayList<String>();
        	if(collected.add(strs[i])) { // meaning it was not added in result before
        		String pattern = strs[i];
        		batch.add(pattern);
        		for(int j=i+1; j<strs.length;j++) {
        			String currString = strs[j];
        			if(!collected.contains(currString) && isAnagram(pattern, currString)) {
        				batch.add(currString);
        				collected.add(currString);
        			}
        		}
        		result.add(batch);
        	}
        }
		return result;
    }

	private static boolean isAnagram(String pattern, String currString) {
		int[] map = new int[127];
		for(char c : pattern.toCharArray()) {
			map[c-'a'] = map[c-'a']+1;
		}
		for(char c : currString.toCharArray()) {
			map[c-'a'] = map[c-'a']-1;
		}
		for(int i=0; i<127; i++) {
			if(map[i] != 0)
				return false;
		}
		return true;
	}
}
