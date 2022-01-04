package problems;

import java.util.Arrays;

public class _189_Rotate_Array {

	public static void main(String[] args) {
		int[] input = {1, 2};
		int k=3;
		System.out.println(Arrays.toString(input));
		int[] output = rotate(input, k);
		System.out.println(Arrays.toString(output));
		
	}

	private static int[] rotate(int[] input, int k) {
		k = k <= (input.length -1) ? k : (k % input.length);
		int rotationStart = input.length;
		int steps = k;
		
		while (k > 0) {
			rotationStart--;
			k--;
		}
		
		int[] output = new int[input.length];
		
		int newArrayPointer = 0;
		while(rotationStart < input.length) {
			output[newArrayPointer++] = input[rotationStart++];
		}
		
		for(int i=0; i < (input.length - steps) ; i++) {
			output[newArrayPointer++] = input[i];
		}
		
		return output;
	}

}
