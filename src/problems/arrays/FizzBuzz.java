package problems.arrays;

import java.util.Arrays;

public class FizzBuzz {

	public static void main(String[] args) {
		int n = 5;
		String[] output = getFizzBuzz(n);
		System.out.println("output "+Arrays.toString(output));
	}

	private static String[] getFizzBuzz(int n) {
		String[] output = new String[n+1];
		
		for(int i=1; i<=n; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				output[i] = "FizzBuzz";
			} else if( i % 3 == 0) {
				output[i] = "Fizz";
			} else if(i % 5 == 0) {
				output[i] = "Buzz";
			} else {
				output[i] = ""+i+"";
			}
		}
		return output;
	}

}
