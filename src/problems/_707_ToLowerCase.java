package problems;

public class _707_ToLowerCase {

	public static void main(String[] args) {
		String input = "MomentousTechnologies";
		System.out.println(input);
		String output = convertToLowerCase(input);
		System.out.println(output);
	}

	private static String convertToLowerCase(String inp) {
		StringBuilder output = new StringBuilder();
		for(char c : inp.toCharArray()) {
			if(c <= 97) {
				c = (char) (c+32);
			}
			output.append(c);
		}
		return output.toString();
	}

}
