package dailycodingchallenge;

import java.util.Arrays;

// 24 Jan 2023
public class CharacterMapping {

	/*
	Determine whether there exists a one-to-one character mapping from one string s1 to another s2.

	For example, given s1 = abc and s2 = bcd, return true since we can map a to b, b to c, and c to d.

	Given s1 = foo and s2 = bar, return false since the o cannot map to two characters. */
	public static void main(String[] args) {
		 //String s1 = "abc"; String s2 = "bcd";
		// String s1 = "foo"; String s2 = "bar";
		String s1 = "badc"; String s2 = "baba";
		System.out.println(checkMapping2(s1,s2));
	}

	// b a d c
	// b a b a 
	// this case will fail, and we need 2 way mapping 
	private static boolean checkMapping(String s1, String s2) {
		int[] mapping = new int[26];
		Arrays.fill(mapping, -1);
		char [] inp = s1.toCharArray();
		char[] values = s2.toCharArray();
		
		for(int i=0; i < s1.length(); i++) {
			int index = inp[i] - 'a';
			int val = values[i] - 'a';
			if(mapping[index] != -1 && mapping[index] != val)
				return false;
			mapping[index] = val;
		}
		
		return true;
	}
	
	// numbers will be inputted ex - "13"
	// total character set is 127
	private static boolean checkMapping2(String s1, String s2) {
		int[] map1 = new int[127];
		int[] map2 = new int[127];
		
		char [] inp1 = s1.toCharArray();
		char[] inp2 = s2.toCharArray();
		
		for(int i=0; i < s1.length(); i++) {
			int val1 = inp1[i] - 0;
			int val2 = inp2[i] - 0;
			
			// these 2 values are locked with each other, a common field is the index.
			if(map1[val1] != map2[val2]) {
				return false;
			}
			map1[val1] = map2[val2] = i+1;
		}
		return true;
	}

}
