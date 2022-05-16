package problems.dynamicprogramming;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 10;
		int callValue = 1;
		int fibValue = getNthNumberInFibSeries(n, callValue);
		System.out.println();
		System.out.println(n+"th number in fibonaci series is"+fibValue);

	}

	private static int getNthNumberInFibSeries(int n, int callValue) {
		if(n == 1) return 0;
		if(n == 2) return 1;
		else {
			int currentResult = getNthNumberInFibSeries(n - 1, ++callValue)
					+ getNthNumberInFibSeries(n - 2, ++callValue);
			System.out.print(currentResult+"\t");
			return currentResult;
		}
	}

}
