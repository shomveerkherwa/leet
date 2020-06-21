package problems;

/*
Given a 32-bit signed integer, reverse digits of an integer.
*/
/*
 * Assume we are dealing with an environment which could only store integers within the 32-bit 
 * signed integer range: [minus 2 power of 31,  2 power of 31 minus 1]. 
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */
public class _7_Reverse_Integer {

	public static void main(String[] args) {
		int inp = -214;
		int reverseNumber = reverse(inp);
		System.out.println(inp);
		System.out.println(reverseNumber);
	}
	
	public static int reverse(int input) {
		int reverse = 0;
		
		while(input != 0) {
			int numToadd = input % 10; // perform modulus operation to get the last digit
			
			// NOTE : Because Boundaries of min and max numbers are set. And as we know in the next step reverse will be multiplied by 10,
			// thats why we divide the MAX and MIN value by 10 and compare with reverse number.
			
			// NOTE : reverse is compared with 7 and -8 with AND (&&) condition because these numbers can occur other wise too, but
			/*
			 * The biggest number an Integer can hold in space is 2147483647,
			 * (Integer.MAX_VALUE / 10) is equal to 214748364, so if the reverse is more then 7
			 * that means that an Integer can't hold that amount of space. The same logic
			 * goes into -8 which is Integer.MIN_VALUE.
			 */
			
			if(reverse > Integer.MAX_VALUE / 10 || reverse == Integer.MAX_VALUE / 10 && reverse < 7)
				return 0;
			
			if(reverse < Integer.MIN_VALUE / 10 || reverse == Integer.MIN_VALUE / 10 && reverse > -8)
				return 0;
			
			reverse = reverse * 10 + numToadd; // multiply existing number by 10 to get a new place in the number and add the number optained in previous step.
			input = input / 10; // get rid of the number at units place , as it was already considered and added to the reverse number.
			
		}
		return reverse;
	}
}
