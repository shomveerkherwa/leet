package problems.strings;

import java.util.Arrays;

public class JumpGame {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 1, 0, 4 };
		//System.out.println(Arrays.toString(nums)+" --> "+canJump(nums));
		System.out.println(Arrays.toString(nums)+" --> "+canJumpBruteForce(nums));
	}
	
	public static boolean canJumpBruteForce(int[] nums) {
		int size = nums.length;
		boolean[] dp = new boolean[size];
		dp[size-1] = true;
		
		for(int i= size-2; i >= 0; i--) {
			for(int j=i+1; j<= Math.min(i+nums[i], size-1); j++) {
				if(dp[j] == true) {
					dp[i] = true;
					continue;
				}
			}
		}
		return dp[0];
	}
	
	public static boolean canJump(int[] nums) {
        int lastGoodIndexPosition = nums.length - 1;
        for(int i= nums.length - 1; i>= 0; i--) {
        	if( i + nums[i] >= lastGoodIndexPosition) {
        		lastGoodIndexPosition = i;
        	}
        }
        return lastGoodIndexPosition == 0;
	}
}
