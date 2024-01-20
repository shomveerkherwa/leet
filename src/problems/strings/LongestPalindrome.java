package problems.strings;

public class LongestPalindrome {

	public static void main(String[] args) {
		String s = "babad";
		String plaindrome = longestPalindrome(s);
		System.out.println(s+"  --->   "+plaindrome);
	}

	private static String longestPalindrome(String s) {
		int n = s.length();
		if(n < 1) return s;
		String result = "";
		for(int i=0; i< n-1;i++) {
			for (int j = i+1; j <n-1; j++) {
				System.out.println(s.substring(i, j));
				//if(isPalindrome(s.substring(i, j))) {
				//	String newResult = s.substring(i, j);
				//	if (result.length() < j)
                //        result = newResult;
				//}
			}
		}
		return result;
	}
	
	private static boolean isPalindrome(String s)
    {
        int i = 0, j = s.length() - 1;
        while (i < j)
        {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
