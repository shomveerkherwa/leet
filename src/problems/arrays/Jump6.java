package problems.arrays;

import java.util.Arrays;

public class Jump6 {

	public static void main(String[] args) {
		int[] nums = {1,-1,-2,4,-7,3}; int k =2;
		//System.out.println(maxResult(nums, k));
		System.out.println(maxResultSimple(nums, k));
	}
	
	private static int maxResultSimple(int[] nums, int k) {
		return maxResult(nums, 0, k);
	}

	private static int maxResult(int[] nums, int i, int k) {
        if(i >= nums.length - 1) 
        	return nums[nums.length - 1];
        
        int max = Integer.MIN_VALUE;
        
        // Mininum of i + k, nums.length to prevent unnecessary calls for out of bounds. 
        for(int j = i + 1; j <= Math.min(i + k, nums.length); j++)
        	max = Math.max(max, maxResult( nums, j , k));
        
        return max;
    }
	public static int maxResult(int[] nums, int k) {
        
		int[] maxAtIndex = new int[nums.length];
		Arrays.fill(maxAtIndex, Integer.MAX_VALUE);
		
		helper(nums,k,0,maxAtIndex);
		
		return maxAtIndex[0];
    }

	private static int helper(int[] nums, int k, int currentIndex, int[] maxAtIndex) {
		
		if(maxAtIndex[currentIndex] != Integer.MAX_VALUE)
			return maxAtIndex[currentIndex];
		
		int incrementedIndex = currentIndex + k;
		int max = nums[currentIndex];
		
		for(int i= currentIndex +1; i<= Math.min(nums.length-1, incrementedIndex); i++)
			max = Math.max(max, max+helper(nums, k, i, maxAtIndex));
		
		maxAtIndex[currentIndex] = max;
		return max;
	}
}
