package problems;

/*
Given a 32-bit signed integer, reverse digits of an integer.
*/
public class _7_Reverse_Integer {

	public static void main(String[] args) {
		int inp = 1000;
		int reverseNumber = reverse(inp);
		System.out.println(inp);
		System.out.println(reverseNumber);
	}
	
	public static int reverse(int input) {
		int reverse = 0;
		
		while(input != 0) {
			int numToadd = input % 10; // perform modulus operation to get the last digit
			reverse = reverse * 10 + numToadd; // multiply existing number by 10 to get a new place in the number and add the number optained in previous step.
			input = input / 10; // get rid of the number at units place , as it was already considered and added to the reverse number.
		}
		return reverse;
	}
}
