package twenty23.array;

import java.util.Arrays;

public class MaxProductSubArray {

	public static void main(String[] args) {
		//int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		//int[] nums = {2,3,-2,4};   // o/p -> 6
		//int[] nums = {-2,1,-1};   // o/p -> 0
		int[] nums = {-3,-1,-1};   // o/p -> 3
		
		int maxSubArrayProduct = soultion(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println(maxSubArrayProduct);
	}

	private static int soultion(int[] nums) {
		
		int maxProduct = 1;
		
		for(int a : nums) {
			maxProduct = maxProduct * a;
		}
		
		int currProduct = 1;
		
		for(int i=0; i< nums.length; i++) {
			
			currProduct *= nums[i];
			
			maxProduct = Math.max(maxProduct, currProduct);
			
			if(currProduct < 0)
				currProduct=1;
			
		}
		return maxProduct;
	}

}
