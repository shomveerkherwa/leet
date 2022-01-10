package problems;

public class _557_Reverse_Sentence {

	public static void main(String[] args) {
		String input = "Let's take the contest";
		System.out.println(input);
		String output = reverseSentence(input);
		System.out.println(output);
	}
	
	private static String reverseSentence(String input) {
		String[] strInp = input.split("\\s");
		StringBuilder sb = new StringBuilder();
		for(String s : strInp) {
			sb.append(reverseInPlace(s.toCharArray()));
			sb.append(" ");
		}
		return sb.toString().trim();
	}

	private static char[] reverseInPlace(char[] inp) {
		int left = 0;
		int right = inp.length - 1;
		while (left < right) {
			char temp = inp[left];
			inp[left] = inp[right];
			inp[right] = temp;
			left ++;
			right --;
		}
		return inp;
	}
}
