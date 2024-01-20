package problems.strings;

public class MultiplyString {

	public static void main(String[] args) {
		String num1 = "123";
		String num2 = "456";
		String result = multiply(num1, num2);
		System.out.println(num1 +" * "+num2+" ---> "+result);
	}

	public static String multiply(String num1, String num2) {
        char[] left = num1.toCharArray();
		char[] right = num2.toCharArray();
		
		Long resultSum = 0l;
		int outerMultiplicant = 0;
		for (int i = right.length-1; i >= 0; i--) {
			int iNum = right[i] - '0';
			Long currentSum = 0l;
			int carry = 0;
			int multiplicant = 0;
			for(int j = left.length-1; j >= 0; j--) {
				int jNum = left[j] - '0';
				int n = iNum * jNum + carry;
				carry = n/10;
				multiplicant = getMulitplicant(multiplicant);
				currentSum = ((n % 10) * multiplicant) + currentSum ;
			}
			if(carry != 0) {
				currentSum = (carry * getMulitplicant(multiplicant)) + currentSum;
			}
			outerMultiplicant = outerMultiplicant == 0 ? 1 : outerMultiplicant * 10;
			resultSum = (currentSum * outerMultiplicant) + resultSum;
		}
		
		return String.valueOf(resultSum);
    }
	
	private static int getMulitplicant(int num) {
		if(num == 0)
			return 1;
		else
			return num * 10;
	}
}
