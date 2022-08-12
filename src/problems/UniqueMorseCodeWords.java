package problems;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
	
	
	public static void main(String[] args) {
		
		String[] words = {"gin","zen","gig","msg"};
		System.out.println(uniqueMorseRepresentations(words));
	}
	
	public static int uniqueMorseRepresentations(String[] words) {
		if(words == null || words.length < 1 )
        	return 0;
		
		String[] alphabets = {".-","-...","-.-.","-..",".","..-.","--.",
				 "....","..",".---","-.-",".-..","--","-.","---",".--.",
				 "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		Set<String> uniqueCodes = new HashSet<String>();
		for(String word : words) {
			StringBuilder builder = new StringBuilder();
			for(int i=0; i< word.length(); i++) {
				builder.append(alphabets[word.charAt(i) - 'a']);
			}
			uniqueCodes.add(builder.toString());
		}
		return uniqueCodes.size();
    }
}
