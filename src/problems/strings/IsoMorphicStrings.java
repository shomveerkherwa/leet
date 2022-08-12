package problems.strings;

import java.util.HashMap;
import java.util.Map;

public class IsoMorphicStrings {

	public static void main(String[] args) {
		String s = "ab";
		String t = "aa";
		System.out.println(s +" and "+ t);
		System.out.println(isIsomorphic2(s,t));
	}

	public static boolean isIsomorphic2(String s, String t) {
		int[] m1 = new int[256];
        int[] m2 = new int[256];
        int n = s.length();
        for (int i = 0; i < n; i++) {
        	int indexs = s.charAt(i);
        	int indext = t.charAt(i);
        	System.out.println(indexs +" "+indext);
            //1. in the beginning since the array is initialized, everythig will be zero , hence they will be ssame
        	//2. If they are set later, they would be set same as per below code , hence inquality will result in false
        	if (m1[s.charAt(i)] != m2[t.charAt(i)])
            	return false;
            m1[s.charAt(i)] = i+1; // we set i+1 because , we begin loop by 0 , and by default all values will be 0
            m2[t.charAt(i)] = i+1;
        }
        return true;
	}
	
	public static boolean isIsomorphic(String s, String t) {
		Map<Character,Character> dict = new HashMap<>();
		int lenS = s.length()-1;
		int lenT = t.length()-1;
		while (lenS >= 0 && lenT >= 0) {
			Character key = s.charAt(lenS);
			Character value = t.charAt(lenT);
			if (dict.containsKey(key)) {
				if (value != dict.get(key))
					return false;
			} else {
				boolean anyMatch = dict.values().stream().anyMatch(e -> e == value);
				if( anyMatch)
					return false;
				dict.put(key, value);
			}
			lenT--;
			lenS--;
		}
		return true;
    }
}
