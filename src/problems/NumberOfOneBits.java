package problems;

public class NumberOfOneBits {

	public static void main(String[] args) {
		int n = 00000000101100;
		int ones = hammingWeight(n);
		System.out.println(ones);
	}

	public static int hammingWeight(int n) {
        int ones = 0;
		
        while(n != 0) {
			ones = ones + (n & 1) ;
			n = n>>>1;
		}
		return ones;
    }
}
