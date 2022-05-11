package problems.arrays;

import java.util.Arrays;

/**
Given an array, rotate the array to the right by k steps, where k is non-negative.
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/
public class RotateArray_ShiftElements {

	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5,6,7};
		int k = 3;
		System.out.println("input  "+ Arrays.toString(nums));
		int[] output = rotateArray(nums, k);
		System.out.println("output "+ Arrays.toString(output));
	}

	/** Below solution works ,but it times out with larges inputs */
	private static int[] rotateArray(int[] nums, int k) {
		
		if(nums == null || nums.length < 2)
			return nums;
		
		int size = nums.length;
		
		//sanitize k
		if(k > size)
		k = k % size;
		
		while(k > 0) {
			int first = nums[size-1];
			for(int i=size-1; i>0; i--) {
				nums[i] = nums[i-1];
			}
			nums[0]=first;
			k--;
		}
		
		return nums;
	}

}
