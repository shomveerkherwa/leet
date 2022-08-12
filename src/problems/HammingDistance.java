package problems;

public class HammingDistance {

	public static void main(String[] args) {
			int x = 64;
			int y = 4;
			int ones = hammingDist(x, y);
			System.out.println(ones);
		}

	public static int hammingDist(int x, int y) {
		int d = 0;
        int bitxor = x ^ y;
        while (bitxor > 0){
            if (bitxor % 2 == 1){
                d++;
            }
            bitxor = bitxor >> 1;
        
        }
        return d;
	}

}
