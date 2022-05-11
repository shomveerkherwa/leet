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
public class RotateArray_DoubleReverse {

	public static void main(String[] args) {
		int [] nums = {1,2,3,4,5,6,7};
		int k = 3;
		System.out.println("input  "+ Arrays.toString(nums));
		int[] output = rotateArray(nums, k);
		System.out.println("output "+ Arrays.toString(output));
	}

	/** 
	 * 	nums = "----->-->"; k =3
		result = "-->----->";

		reverse "----->-->" we can get "<--<-----"
		reverse "<--" we can get "--><-----"
		reverse "<-----" we can get "-->----->"
		this visualization help me figure it out :)
	 *	
	 **/
	private static int[] rotateArray(int[] nums, int k) {
		
		if(nums == null || nums.length < 2)
			return nums;
		
		int size = nums.length;
		
		//sanitize k
		if(k > size)
		k = k % size;
		
		//1. Reverse complete array
		reverse(nums, 0, size-1);
		//2. Reverse the first k elements and the remaining elements from k till end
		reverse(nums, 0, k-1);
		reverse(nums, k, size-1);
		return nums;
	}

	private static void reverse(int[] nums, int start, int end) {
		while(start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;
			end--;
		}
	}

}
