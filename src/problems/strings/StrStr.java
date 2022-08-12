package problems.strings;

public class StrStr {

	public static void main(String[] args) {
		String needle = "";
		String haystack = "kagpsorabisg";
		int subStringIndex = getSubstringIndex(haystack, needle);
		System.out.println(needle +" is found in "+haystack+" at index "+ subStringIndex);
	}

	private static int getSubstringIndex(String haystack, String needle) {
		
		if(haystack == null || needle == null) {
			return -1;
		}
			
		int hayLength = haystack.length();
		int nedLen = needle.length();
		
		if(hayLength < nedLen || nedLen==0) {
			return -1;
		}
		
		char[] hayInp = haystack.toCharArray();
		char[] nedInp = needle.toCharArray();
		
		int index = 0;
		int subIndex = -1;
		
		while(index < hayLength) {
			if(hayInp[index] == nedInp[0]) {
				subIndex = checkMatch(hayInp, nedInp, index);
						if(subIndex != -1)
							return subIndex;
			}
			index++;
		}
		return -1;
	}

	private static int checkMatch(char[] hayInp, char[] nedInp, int index) {
		if(nedInp.length + index > hayInp.length)
			return -1;
		
		int i=0, j=index;
		
		while(i < nedInp.length) {
			if(nedInp[i++] != hayInp[j++]) {
				return -1;
			}
		}
		return index;
	}

}
