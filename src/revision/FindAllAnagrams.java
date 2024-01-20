package revision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagrams {

	public static void main(String[] args) {
		String s = "cbaebabacd"; String p = "abc";
		System.out.println(s +" and "+p);
		List<Integer> result = findAnagrams(s, p);
		result.forEach(i -> System.out.print(i+" \t"));
	}
	
	public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<Integer>();
        int left = 0; int right = 0; int pSize = p.length(); int sSize = s.length();
        HashMap<Character, Integer> frequency = new HashMap<>();
        
        // add psize chars to match later
        while(right < pSize) {
        	frequency.put(s.charAt(right), frequency.getOrDefault(s.charAt(right), 0)+1);
        	right++;
        }
        
        // continue checking the big string for pattern
        while(right < sSize) {
        	for(int i=0; i<p.length(); i++) {
        		if(frequency.containsKey(p.charAt(i))) {
        			if(i == pSize-1) {
        				result.add(left);
        			}
        		}else {
        			break;
        		}
        	}
        	frequency.put(s.charAt(right), frequency.getOrDefault(s.charAt(right), 0)+1);
        	right++;
        	int op =  frequency.get(s.charAt(left)) == 1 ?  frequency.remove(s.charAt(left)) : frequency.put(s.charAt(left), frequency.get(s.charAt(left))+1);
        	left++;
        }
        return result;
    }

}
