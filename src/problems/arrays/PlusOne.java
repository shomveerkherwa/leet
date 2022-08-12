package problems.arrays;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		
		int[] inp = {9,9};
		System.out.println("input "+Arrays.toString(inp));
		int[] output = plusOne(inp);
		System.out.println("output "+Arrays.toString(output));
	}

	private static int[] plusOne(int[] digits) {
		int n = digits.length;
	    for(int i=n-1; i>=0; i--) {
	        if(digits[i] < 9) {
	            digits[i]++;
	            return digits;
	        }
	        digits[i] = 0;
	    }
	    
	    int[] newNumber = new int[n+1];
	    newNumber[0] = 1;
	    return newNumber;
	}

}
