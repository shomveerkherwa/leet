package problems;

public class IsSubsequence {

	public static void main(String[] args) {
		String s = "ace"; String t="abcde";
		//String s = "aec"; String t="abcde";
		System.out.println(s +" ------> "+t);
		System.out.println(isSubsequence(s, t));
	}
	
	public static boolean isSubsequence(String s, String t) {
		int j=0;
		char[] ss = s.toCharArray();
		char[] tt = t.toCharArray();
		for(int i=0; i<t.length(); i++) {
			if( j < s.length() && t.charAt(i) == s.charAt(j)) {
				j++;
			}
			if(j == s.length()) {
				return true;
			}
		}
		return false;
	}

}
