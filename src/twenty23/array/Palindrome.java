package twenty23.array;

public class Palindrome {

	public static void main(String[] args) {
		int num = 121;
		boolean isPalindrome = solution(num);
		System.out.println(isPalindrome);
	}

	private static boolean solution(int num) {
		int copyNum = num;
		System.out.println(num);
		int revNum = 0;
		while(num > 0) {
			int mod = num % 10;
			num = num /10;
			revNum = revNum * 10 + mod;
		}
		System.out.println(revNum);
		return copyNum == revNum;
	}

}
