package problems.strings;

public class IsPalindrome {

	public static void main(String[] args) {
		String input = "GA man, a plan, a canal: Panamag";
		
		boolean isPalindrome = checkPalindrome(input);
		System.out.println(input+" isPalindrome? "+isPalindrome);
	}

	private static boolean checkPalindrome(String input) {
		// check for zero length of input
		if(input == null || input.length() == 0)
			return true;
		
		//use 2 pointers from start and end
		char[] inp = input.toCharArray();
		int head = 0;
		int tail = inp.length-1;
		
		while(head <= tail) {
			if(!Character.isLetterOrDigit(inp[head])) {
				head++;
			} else if (!Character.isLetterOrDigit(inp[tail])) {
				tail --;
			} else {
				if(Character.toLowerCase(inp[head]) != Character.toLowerCase(inp[tail])) {
					return false;
				}
				else {
					head++;
					tail--;
				}
			}
		}
		return true;
	}
}
