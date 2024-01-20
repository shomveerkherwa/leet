package twenty23.array;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		String s = "CCC";
		int ans = romanToInt(s);
		System.out.println(s+ " ----> "+ans);

	}

	public static int romanToInt(String s) {
        Map<Character, Integer> dict = new HashMap<>();
        dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);
        
        int ans = 0;
        
        for(int i=0; i<s.length();i++) {
        	Character c = s.charAt(i);
        	int value = dict.get(c);
        	
        	if( i < s.length()-1 && dict.get(c) > dict.get(s.charAt(i+1))) {
        		ans -= value;
        	} else {
        		ans += value;
        	}
        }
        
        return ans;
    }

}
