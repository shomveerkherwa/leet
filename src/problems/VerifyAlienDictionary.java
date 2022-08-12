package problems;

public class VerifyAlienDictionary {
	private static int[] precedence = new int[26];
	
	public static void main(String[] args) {
		String[] words = {"amway","betalli","chinese","dog"};
		String order = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("isAlienSorted "+isAlienSorted(words, order));
	}
	
	public static boolean isAlienSorted(String[] words, String order) {
		for(int i=0; i < order.length(); i++){
            precedence[order.charAt(i) - 'a'] = i;
        }
        for (int i = 1; i < words.length; i++) {
			String currentWord = words[i];
			System.out.println("currentWord " + currentWord);
			String previousWord = words[i-1];
			System.out.println(previousWord);
			if(verifyPrecedence(previousWord, currentWord)) {
				return false;
			}
		}
        return true;
    }
	
	private static boolean verifyPrecedence(String currentWord, String nextWord) {
		for(int p = 0; p < currentWord.length() && p < nextWord.length(); p++) {
			if(currentWord.charAt(p) != nextWord.charAt(p)) {
				boolean check = precedence[currentWord.charAt(p) - 'a'] > precedence[nextWord.charAt(p) - 'a'];
				return check;
			}
		}
		return currentWord.length() > nextWord.length();
	}
}
