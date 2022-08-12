package problems;

public class VerifyAlienDictionarySolution {
	static int[] mapping = new int[26];
	
	public static void main(String[] args) {
		String[] words = {"hello","tuv"};
		String order = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("isAlienSorted "+isAlienSorted(words, order));
	}

    public static boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < order.length(); i++) {
        	System.out.println((int) order.charAt(i));
        	System.out.println((int) 'a');
        	System.out.println(order.charAt(i) - 'a');
        	mapping[order.charAt(i) - 'a'] = i;
        }
        for (int i = 1; i < words.length; i++)
            if (bigger(words[i - 1], words[i]))
                return false;
        return true;
    }

    static boolean bigger(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        for (int i = 0; i < n && i < m; ++i) {
        	if (s1.charAt(i) != s2.charAt(i)) {
                boolean check =mapping[s1.charAt(i) - 'a'] > mapping[s2.charAt(i) - 'a'];
                return check;
        	}
        }
        return n > m;
    }
	
}
