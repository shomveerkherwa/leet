package problems.strings;

public class IsSubsequence {

	public static void main(String[] args) {
		String s = "abc";
		String t = "achbgde";
		System.out.println(s +" and "+ t +" are subsequence ? "+isSubsequence(s, t));
	}

	public static boolean isSubsequence(String s, String t) {
		char[] sArray = s.toCharArray();
        int sLen = s.length();
        int sIndex = 0;
        
        char[] tArray = t.toCharArray();
        int tLen = t.length();
        int tIndex = 0;
        
        while(tIndex < tLen) {
        	if(tArray[tIndex] == sArray[sIndex]) {
        		sIndex++;
        		if(sIndex == sLen)
        			return true;
        	}
        	tIndex++;
        }
        
        return false;
	}
	
}
