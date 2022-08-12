package problems;

public class HammingDistanceAgain {

	public static void main(String[] args) {
		int x = 64;
		int y = 4;
		int ones = hammingDist(x, y);
		System.out.println(ones);
	}

	private static int hammingDist(int x, int y) {
		int xor = x ^ y;
		int count = 0;
		for(int i=0; i<32; i++) {
			if((xor & 1) == 1) {
				count++;
			}
			xor = xor >> 1;
		}
		return count;
	}

}
