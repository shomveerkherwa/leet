package twenty23.array;

import java.util.Arrays;

public class MaxSubArray {

	public static void main(String[] args) {
		//int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		int[] nums = {5,4,-1,7,8};
		int maxSubArraySum = soultion(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println(maxSubArraySum);
	}

	private static int soultion(int[] nums) {
		
		int maxSum = nums[0];
		int currSum = 0;
		
		for(int i=0; i< nums.length; i++) {
			
			currSum += nums[i];
			
			maxSum = Math.max(maxSum, currSum);
			
			if(currSum < 0)
				currSum=0;
			
		}
		return maxSum;
	}

}
