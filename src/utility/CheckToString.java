package utility;

import java.util.Arrays;

public class CheckToString {

	public static void main(String[] args) {
		String inp ="(())";
		System.out.println(inp);
		char[] inpArray = inp.toCharArray();
		System.out.println(Arrays.toString(inpArray));
	}

}
