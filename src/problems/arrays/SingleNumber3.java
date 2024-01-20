package problems.arrays;

import java.util.Arrays;

public class SingleNumber3 {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 1, 3, 2, 5 };
		System.out.println(Arrays.toString(nums)+ " ----> "+Arrays.toString(singleNumber(nums)));
		
	}
	
	public static int[] singleNumber(int[] nums) {
		int[] result = new int[2];
		int combinedXor = 0;
		
		//1. XOR everything so that only unpaired numbers are left
		for(int i : nums) combinedXor ^= i;
		
		//2. get the first unset bit of the combination
		int firstSet = combinedXor & -combinedXor;
		
		for (int i : nums) {
			if ((i & firstSet) != 0) {
				result[0] = result[0] ^ i;
			} else {
				result[1] = result[1] ^ i;
			}
		}
		return result;
	}
}
