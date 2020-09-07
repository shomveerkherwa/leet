package problems;

import java.util.Arrays;

public class _344_ReverseString {

	public static void main(String[] args) {
		char[] inp = { 'w', 'f', 'i', 'e', 's', 't', 'a' };
		System.out.println(Arrays.toString(inp));
		inp = reverseInPlace(inp);
		System.out.println(Arrays.toString(inp));
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
