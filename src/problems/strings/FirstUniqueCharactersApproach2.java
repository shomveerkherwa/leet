package problems.strings;

public class FirstUniqueCharactersApproach2 {

	public static void main(String[] args) {
		String inp = "leetcode";
		int uniqueIndex = getindexOfNonRepeatingChaacter(inp);
		System.out.println("inp "+inp +" "+uniqueIndex);

	}

	private static int getindexOfNonRepeatingChaacter(String inp) {
		int[] charCount = new int[26];
		char[] inpArray = inp.toCharArray();
		for(char c : inpArray) {
			charCount[c - 'a']++;
		}
		for(int i=0; i<inpArray.length;i++) {
			if(charCount[inpArray[i] - 'a'] == 1) {
				return i;
			}
		}
		return -1;
	}

}
