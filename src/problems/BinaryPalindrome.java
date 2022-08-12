package problems;

import java.util.Arrays;

public class BinaryPalindrome {

	public static void main(String[] args) {
		int n = 2 ;
		int[] palins = getPalindromes(n);
		System.out.println(Arrays.toString(palins));
		System.out.println(n+"th palindrome number is "+palins[n-1]);
	}
	
	private static int[] getPalindromes(int n) {
		int[] palinNumbers = new int[n];
		int numberCounter = 1;
		int plaindromeCount = 0;
		while( plaindromeCount < n) {
			if(check(numberCounter)) {
				System.out.println(Integer.toBinaryString(numberCounter));
				palinNumbers[plaindromeCount] = numberCounter;
				numberCounter++;
				plaindromeCount++;
			}
			numberCounter++;
		}
		return palinNumbers;
	}

	private static boolean check(int n) {
		//reverse bits of a number 
		int result = 0;
		int copy = n;
		
		while(n > 0) {
			result = result << 1;
			int add = n & 1;
			result = result + add;
			n = n >> 1;
		}
		return (copy ^ result) == 0;
	}
	

}
