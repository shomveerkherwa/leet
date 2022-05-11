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
public class RotateArray_CopyArrays {

	public static void main(String[] args) {
		//int [] nums = {1,2,3,4,5,6,7};
		int [] nums = {1,2};
		int k = 3;
		int[] output = rotateArray(nums, k);
		System.out.println("input  "+ Arrays.toString(nums));
		System.out.println("output "+ Arrays.toString(output));
	}

	private static int[] rotateArray(int[] nums, int k) {
		
		if(nums == null || nums.length < 2)
			return nums;
		
		int size = nums.length;
		
		//sanitize k
		if(k > size)
		k = k % size;
		
		
		int[] output = new int[size];
		int startingPoint = size - k ;
		int i = 0, j=startingPoint ;
		// fill the output array with the kth position of the input array 
		for(; i < k; i++) {
			output[i] = nums[j++];
		}
		for(int z=0; i<size; i++,z++) {
			output[i] = nums[z];
		}
		
		return output;
	}

}
