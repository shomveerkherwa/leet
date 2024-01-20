package problems.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestPlaindromePossible {

	public static void main(String[] args) {
		String s = "AB";
		//System.out.println("Longest length of a possible palindrome with "+s+" is "+longestPalindrome(s));		
		//System.out.println("Longest length of a possible palindrome with "+s+" is "+longestPalindrome2(s));		
		//System.out.println("Longest length of a possible palindrome with "+s+" is "+longestPalindromeFastest(s));	
		System.out.println("Longest length of a possible palindrome with " + s + " is " + longestPalindromeFastest(s));		
		
	}

	
	private static int longestPalindromeFastest(String s) {
		int[] frequency = new int[128];
		for(Character c : s.toCharArray()) {
			frequency[c]++;
		}
		
		int oddOccurance = 0;
		for(int i : frequency) {
			oddOccurance += i & 1;
		}
		int count = s.length() - oddOccurance;
		count += (oddOccurance > 0) ? 1 : 0;
		return count;
	}


	public static int longestPalindrome(String s) {
        int count = 0;
		
        if(s== null || s.length()==0)
			return 0;
		
        if(s.length() == 1)
			return 1;
        
		Set<Character> set = new HashSet<Character>();
        for(Character c : s.toCharArray()) {
        	if(set.contains(c)) {
        		set.remove(c);
        		count= count+2;
        	}else {
        		set.add(c);
        	}
        }
        
        if(!set.isEmpty()) {
        	count++;
        }
        
		return count;
    }
	
	public static int longestPalindrome2(String s) {
        if(s==null || s.length()==0) return 0;
        HashSet<Character> hs = new HashSet<Character>();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                count++;
            }else{
                hs.add(s.charAt(i));
            }
        }
        if(!hs.isEmpty()) return count*2+1;
        return count*2;
}
}
