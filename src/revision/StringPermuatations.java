package revision;

public class StringPermuatations {

	public static void main(String[] args) {
		String inp = "abcd";
		findPermutations(inp, 0, inp.length() - 1);
	}

	private static void findPermutations(String inp, int left, int right) {
		if(left == right)
			System.out.println(inp);
		else {
			for(int i=left; i<= right; i++) {
				inp = swap(inp, left, i);
				findPermutations(inp, left+1, right);
				inp = swap(inp, left, i);
			}
		}
	}

	private static String swap(String inp, int left, int i) {
		char[] inpArray = inp.toCharArray();
		char t = inpArray[left];
		inpArray[left] = inpArray[i];
		inpArray[i] = t;
		return String.valueOf(inpArray);
	}

}
