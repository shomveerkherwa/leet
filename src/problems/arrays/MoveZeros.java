package problems.arrays;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		int[] inp = { 1, 0, 3, 0, 0, 11, 15 };
		System.out.println("input  "+Arrays.toString(inp));
		int[] output = moveZeros(inp);
		System.out.println("output "+Arrays.toString(output));
	}

	private static int[] moveZeros(int[] inp) {
		int nonZeroIndex = 0;
		int size = inp.length;
		for (int i = 0; i < size; i++) {
			if(inp[i] != 0) {
				inp[nonZeroIndex++] = inp[i];
			}
		}
		while(nonZeroIndex < size) {
			inp[nonZeroIndex++] = 0;
		}
		return inp;
	}
}
