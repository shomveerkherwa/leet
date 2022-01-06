package problems;

import java.util.Arrays;

public class _283_Move_Zeros_attempt_2 {

	public static void main(String[] args) {
		int[] nums = {4,2,4,0,0,3,0,5,1,0};
		System.out.println(Arrays.toString(nums));
		moveZeros(nums);
		System.out.println(Arrays.toString(nums));
	}

	// 0,1,0,3,12
	// 1,0,0,3,12
	// 1,3,0,0,12
	// 1,3,12,0,0
	private static void moveZeros(int[] nums) {
		int size = nums.length;
		int nonZeroFlag = 0;
		
		for(int i=0; i<size; i++) {
			if(nums[i] != 0) {
				nums[nonZeroFlag] = nums[i];
				//increment non-zeroFlag only when a non-zero element is found.
				nonZeroFlag++;
			}
		}
		
		// now that we have over ridden all the zero's, and moved the flag only when we had a non-zero element
					// mark the rest of the array as 0;
		while(nonZeroFlag < size) {
			nums[nonZeroFlag] = 0;
			nonZeroFlag++;
			}
	}

	

}
