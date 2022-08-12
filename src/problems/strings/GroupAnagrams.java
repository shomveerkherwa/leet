package problems.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		//String[] strs = {"eat","tea","tan","ate","nat","bat"};
		String[] strs = {"a","b","c","d","e"};
		System.out.println(Arrays.toString(strs));
		List<List<String>> anaGroup = groupAnagrams(strs);
		anaGroup.stream().forEach(e -> 
			System.out.println(Arrays.toString(e.toArray()))
								);
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		if(strs == null || strs.length == 0)
			return new ArrayList<>();

		Map<String, List<String>> resultMap= new HashMap<>();
		for(String s : strs) {
			char[] chRep = new char[26];
			for(char c: s.toCharArray()) {
				chRep[c - 'a']++;
			}
			String keyStr = String.valueOf(chRep);
			if(!resultMap.containsKey(keyStr))
				resultMap.put(keyStr, new ArrayList<>());
			resultMap.get(keyStr).add(s);
		}
		return new ArrayList<>(resultMap.values());
    }
}
