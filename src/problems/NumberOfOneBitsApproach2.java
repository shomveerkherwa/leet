package problems;

public class NumberOfOneBitsApproach2 {

	public static void main(String[] args) {
		int n = 10000;
		int ones = hammingWeight(n);
		System.out.println(ones);
	}

	// need to revist this. No idea how it is working.
	public static int hammingWeight(int n) {
		int ctr = 0;
        while (n != 0) {
            n = n & (n-1);
            ctr++;
        }
        return ctr;
    }
}
