package problems;

import java.util.Arrays;

public class _977_Square_Sort_Ascending_Array {

	public static void main(String[] args) {
		int[] input = {-5, -3, -2, -1 };
		int[] squaredAndSorted = squareAndSortElements(input);
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(squaredAndSorted));
		
	}

	// { -4, -1, 0, 3, 10 }
	// {-4}
	// {}
	private static int[] squareAndSortElements(int[] input) {
		int left = 0;
		int size = input.length-1;
		int right = size;
		int[] output = new int[input.length];
		
		// lets move the left pointer until there are negative numbers
		for(int i=0; i<= size; i++) {
			if(input[i] <= 0) {
				left= i;
			}else {
				break;
			}
		}
		
		// adjust the right pointer to just after left. Check for edge case where left == right.
		right = left == size? left: left+1;
		
		// add numbers in the output array
		for (int i = 0; i <= size; i++) {
			
			// get both the square because square of a negative number can be more than of the positive
			int leftSquare = (left >= 0) ? input[left] * input[left] : Integer.MAX_VALUE;
			int rightSquare = (right <= size) ? input[right] * input[right] : Integer.MAX_VALUE;

			// check which value needs to be used and what pointer needs to be moved.
			if (leftSquare < rightSquare) {
				output[i] = leftSquare;
				left--;
			} else if (leftSquare <= rightSquare && left == right) {
				output[i] = leftSquare;
				left--;
				right++;
			} else {
				output[i] = rightSquare;
				right++;
			}
		}
		return output;
	}

}
