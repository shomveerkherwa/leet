package problems;

import java.util.Arrays;

public class MaxSubArray {

	public static void main(String[] args) {
		//int[] inp = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int[] inp = { -2, -1 };
		int max = findMaxSumOfSubArray(inp);
		System.out.println(Arrays.toString(inp)+" max sum is "+max);
	}

	private static int findMaxSumOfSubArray(int[] nums) {
		int curSum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		for(int i=0; i< nums.length; i++) {
			curSum = curSum + nums[i];
			if(maxSum < curSum) {
				maxSum = curSum;
			}
			if(curSum < 0) {
				curSum = 0; //reset
			}
		}
		return maxSum;
	}
	
}
