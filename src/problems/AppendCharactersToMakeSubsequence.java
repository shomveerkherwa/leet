package problems;

public class AppendCharactersToMakeSubsequence {

	public static void main(String[] args) {
		String s = "coding"; String t="coaching";
		//String s = "aec"; String t="abcde";
		System.out.println(s +" ------> "+t);
		System.out.println(countCharToMakeSubsequence(s, t));
	}
	
	public static int countCharToMakeSubsequence(String s, String t) {
		int j=0;
		char[] ss = s.toCharArray();
		char[] tt = t.toCharArray();
		int ssize = s.length();
		int tsize = t.length();
		for(int i=0; i<tsize; i++) {
			if( j < ssize && tt[i] == ss[j]) {
				j++;
			}
			if(j == ssize) {
				return 0;
			}
		}
		return ssize-j;
	}
}
