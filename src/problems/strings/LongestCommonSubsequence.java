package problems.strings;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		String s = "psnw";
		String t = "vozsh";
		System.out.println(s +" and "+ t +" are subsequence ? "+longestCommonSubsequence(s, t));
	}

	public static int longestCommonSubsequence(String text1, String text2){
        int longIndex = 0;
        String s = text2; String t = text1;
        if(text1.length() < text2.length()){
            s = text1; t = text2;
        }
        if(s.length() == 0) return longIndex;    
    	
        char[] sArray = s.toCharArray();
        int sLen = s.length();
        int sIndex = 0;
        
        char[] tArray = t.toCharArray();
        int tLen = t.length();
        int tIndex = 0;
        
        while(tIndex < tLen && sIndex < sLen) {
        	if(tArray[tIndex] == sArray[sIndex]) {
        		sIndex++;
                longIndex++;
        	}
        	tIndex++;
        }
        return longIndex;
	}
}
