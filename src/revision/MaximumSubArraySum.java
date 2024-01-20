package revision;

import java.util.Arrays;

public class MaximumSubArraySum {

	public static void main(String[] args) {
		int[] nums= {1,5,4,2,9,9,9}; 
		int k = 3;
		System.out.println(Arrays.toString(nums));
		System.out.println(maximumSubarraySum(nums, k));
	}

	public static long maximumSubarraySum(int[] nums, int k) {
        int maxSum = 0;
        int size = nums.length;
        int windowStart = 0;
        int sum = 0;
        
        for( int windowEnd = 0; windowEnd < size; windowEnd++) {
        	sum = sum +nums[windowEnd];
        	
        	if( (windowEnd-windowStart+1) == k) {
        		maxSum = Math.max(maxSum,  sum);
        		sum = sum - nums[windowStart++];
        	}
        }
        return maxSum;
    }
}
