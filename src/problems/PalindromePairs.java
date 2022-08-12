package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePairs {

	public static void main(String[] args) {
		String[] words = {"a","abc","aba",""};
		System.out.println(Arrays.toString(words));
		List<List<Integer>> pairs = palindromePairs(words); 
		for(List<Integer> pair : pairs) {
			System.out.println(Arrays.toString(pair.toArray()));
		}
	}
	
	 public static List<List<Integer>> palindromePairs(String[] words) {
	     List<List<Integer>> pairs = new ArrayList<List<Integer>>();   
		 for(int i=0; i < words.length; i++) {
			 
			 for(int j=0; j< words.length; j++) {
				 if(i != j) {
					 if(isPalindrome(words[i], words[j])) {
						 System.out.println(words[i]+""+words[j]+" at "+i+" and "+j);
						 List<Integer> pair = new ArrayList<Integer>();
						 pair.add(i);
						 pair.add(j);
						 pairs.add(pair);
					 }
				 }
			 }
		}
	     return pairs;
	 }

	private static boolean isPalindrome(String first, String second) {
		String completeWord = first + second;
		char[] array = completeWord.toCharArray();
		int i = 0; 
		int j = array.length-1;
		while(i < j) {
		 if(array[i] != array[j]) {
			 return false;
		 }
		 i++;
		 j--;
		}
		return true;
	}
}
