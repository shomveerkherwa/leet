package problems.strings;

public class LongestCommonSubSequenceDP {

	public static void main(String[] args) {
		String s = "psnw";
		String t = "vozsh";
		System.out.println(s +" and "+ t +" are subsequence ? "+longestCommonSubsequence(s, t));
	}
	
	public static int longestCommonSubsequence(String text1, String text2){
        int t1Len = text1.length();
        int t2Len = text2.length();
        int[][] dp = new int[t1Len+1][t2Len+1];
        for(int i=1; i<= t1Len; i++)
        	for(int j=1; j<= t2Len; j++)
        		dp[i][j] = -1;
        return lcsUtil(t1Len, t2Len, text1, text2, dp);
	}

	private static int lcsUtil(int t1Len, int t2Len, String text1, String text2, int[][] dp) {
		if(t1Len == 0 || t2Len == 0)
			return 0;
		
		if(dp[t1Len][t2Len] != -1)
			return dp[t1Len][t2Len];
		
		if(text1.charAt(t1Len-1) == text2.charAt(t2Len-1)) {
			int result = 1 + lcsUtil(t1Len-1, t2Len-1, text1, text2, dp);
			dp[t1Len][t2Len] = result;
			return result; 
		} else {
			int result = Math.max(lcsUtil(t1Len-1, t2Len, text1, text2, dp),
			lcsUtil(t1Len, t2Len-1, text1, text2, dp));
			dp[t1Len][t2Len] = result;
			return result;
		}
	}
	
}
