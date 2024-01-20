package dailycodingchallenge;

// 20 jan 2024
/*Write an algorithm that finds the total number of set bits in all integers between 1 and N*/
public class TotalSetBits {

	public static void main(String[] args) {
		int inp = 7;  //  0000 0111 -> 3 bits
		System.out.println(countSetBits(inp));
		
		int n = 10;
		System.out.println(countSetBitsTillN(n));
	}

	private static int countSetBits(int inp) {
		int count = 0;
		
		while(inp > 0) {
			if((inp & 1) == 1) {
				count++;
			}
			inp = inp >> 1;
		}
		
		return count;
	}
	
	private static int countSetBitsTillN(int inp) {
		int count = 0;
		for(int i=1; i <= inp; i++) {
			int current = i;
			while(current > 0) {
				if((current & 1) == 1) {
					count++;
				}
				current = current >> 1;
			}	
		}
		return count;
	}

}
