package problems.strings;

public class MultiplyArrays {

	public static void main(String[] args) {
		int[] left = {22};
		int[] right = {9};
		
		int resultSum = 0;
		int outerMultiplicant = 0;
		for (int i = right.length-1; i >= 0; i--) {
			int currentSum = 0;
			int carry = 0;
			int multiplicant = 0;
			for(int j = left.length-1; j >= 0; j--) {
				int n = right[i]*left[j] + carry;
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
		System.out.println("Result Sum "+resultSum);		
	}

	private static int getMulitplicant(int num) {
		if(num == 0)
			return 1;
		else
			return num * 10;
	}
}
