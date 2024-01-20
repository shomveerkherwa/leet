package revision.strings;

public class LongestPalindromSubString {

	public static void main(String[] args) {
		String inp = "babad";
		System.out.println(longestPalindrome(inp));
	}

	public static String longestPalindrome(String inp) {
		int start = 0;
		int end = 0;
		for (int i = 0; i < inp.length(); i++) {
			int len1 = midAndExpand(inp, i, i);
			int len2 = midAndExpand(inp, i, i + 1);
			int maxLen = Math.max(len1, len2);
			if((end-start) < maxLen) {
				start = i - (maxLen-1)/2;
				end = i+ maxLen/2;
			}
		}
		return inp.substring(start, end+1);
	}

	private static int midAndExpand(String inp, int left, int right) {
		while (left >= 0 && right < inp.length() && inp.charAt(left) == inp.charAt(right)) {
			left--;
			right++;
		}
		return right - left - 1;
	}

}
