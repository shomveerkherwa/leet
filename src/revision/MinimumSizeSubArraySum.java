package revision;

import java.util.Arrays;

public class MinimumSizeSubArraySum {

	public static void main(String[] args) {
		int target = 7; int nums[] = {2,3,1,2,4,3};
		System.out.println(Arrays.toString(nums));
		System.out.println(minSubArrayLen(target, nums));
		System.out.println(minSubArrayLenAgain(target, nums));
	}
	
	public static int minSubArrayLenAgain(int target, int[] nums) {
	       int left=0; int right =0;
	        int sum =0;
	        int minLength = Integer.MAX_VALUE;
	       for(;right < nums.length; right++){
	           sum = sum + nums[right];
	           
	           while(sum >= target){
	        	   minLength = Math.min(minLength, right-left+1);
	 	           sum = sum - nums[left++];
	           }
	       }
	       return minLength == Integer.MAX_VALUE ? 0 : minLength;
	    }
	
	public static int minSubArrayLen(int target, int[] nums) {
        int size = Integer.MAX_VALUE;
        int curSum =0;
        int left=0;
        for(int right=0; right<nums.length; right++) {
        	curSum = curSum + nums[right];
        	
        	while(curSum >= target) {
        		size = Math.min(size, right-left+1);
        		curSum = curSum - nums[left];
        		left++;
        	}
        }
        return size == Integer.MAX_VALUE ? 0 : size;
    }

}
