package revision.hashmap;

public class Pangram {

	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		System.out.println(checkIfPangram(sentence));
	}

	public static boolean checkIfPangram(String sentence) {
		int[] map = new int[26];
		for(char c : sentence.toCharArray()) {
			map[c-'a']++;
		}
		for(int i : map) {
			if(i == 0)
				return false;
		}
		return true;
	}

}
