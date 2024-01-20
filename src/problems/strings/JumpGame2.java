package problems.strings;

import java.util.Arrays;

public class JumpGame2 {

	public static void main(String[] args) {
		//int[] nums = {2,3,1,1,4};
		int[] nums = {2,1,2,3,2,1,1,2,5,6};
		System.out.println(Arrays.toString(nums)+" will need minimum jumps to reach end -> "+jumpOptimum(nums));

	}

	public static int jumpOptimum(int[] nums) {
		int jump =0, end = 0, farthest =0;
		for(int i=0; i< nums.length-1; i++) {
			farthest = Math.max(farthest, i+nums[i]);
			if(i == end) {
				end = farthest;
				jump++;
			}
		}
		return jump;
	}
	
	public static int jump(int[] nums) {
        int n=nums.length;
        int[]dp= new int[n];
        Arrays.fill(dp, Integer.MAX_VALUE); // this will surely change because we know we can definately reach end as per requirmeents
        dp[n-1] = 0; // because we are at last
        
        for(int i = n-2; i >= 0; i--) {
        	int min = Integer.MAX_VALUE; // current minimum 
        	int jBoundary = Math.min(n-1, i+nums[i]); 
        	//check for all possible variations
        	for(int j=i+1; j <= Math.min(n-1, i+nums[i]); j++) {
        		min = Math.min(min, dp[j]);
        	}
        	
        	if(min != Integer.MAX_VALUE)
        		dp[i] = 1 + min;
        }
        System.out.println(Arrays.toString(dp));
        return dp[0];
    }
}
