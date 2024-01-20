package problems.strings;

public class ConcatenateAndLongestPalindromePossible {

	public static void main(String[] args) {
		//String[] words = {"lc","cl","gg"};
		String[] words = {"ab","ty","yt","lc","cl","ab"};
		
		System.out.println(longestPalindrome(words));
		System.out.println(longestPalindromeTake2(words));
		
	}

	
	private static int longestPalindromeTake2(String[] words) {
		
		int equals = 0;
		int rev = 0;
		int solo = 0;
		int sameSingles = 0;
		
		
		
		for(int i=0; i< words.length-1; i++) {
			for(int j=i+1; j < words.length; j++) {
				if(words[i].equalsIgnoreCase(words[j]))
					equals++;
				else if(words[i].equalsIgnoreCase(new StringBuilder(words[j]).reverse().toString()))
					rev++;
				else
					solo++;
			}
		}
		
		int count = (equals + rev)* 2;
		
		count += (solo > 0) ? 2 : 0;
		
		return count;
	}


	public static int longestPalindrome(String[] words) {
		int count = 0;
		StringBuilder sb = new StringBuilder();
		int[] freq = new int[128];
		
		for(String s : words)
			sb.append(s);
		
		for(Character c :sb.toString().toCharArray())
			freq[c]++;
		
		int odd =0;
		for(int i=0; i< freq.length; i++)
			odd += freq[i] & 1;
		
		count = sb.length() - odd; 
		count += (odd > 0) ? 1 : 0;
		return count;
    }
}
