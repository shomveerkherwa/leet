package problems;

/*
 * Determine whether an integer is a palindrome.
 * An integer is a palindrome when it reads the same backward as forward.
*/
public class _9_Palindrome_Number {

	public static void main(String[] args) {
		int input = 12321;
		boolean result = isPalindrome(input);
		System.out.println(result);
	}

	public static boolean isPalindrome(int x) {
		if(x == 0)
			return true;
		
		if(x < 0 || x % 10 == 0)
			return false;
		
		int reversedNumber = 0;
		
		// This way we traverse only until half of the number 
		while(x > reversedNumber) {
			int toAdd = x % 10;
			reversedNumber = reversedNumber * 10 + toAdd;
			x = x/10;
		}
		
		if(x == reversedNumber || x == reversedNumber/10)
			return true;
		
		
		return false;
		
	}
}
