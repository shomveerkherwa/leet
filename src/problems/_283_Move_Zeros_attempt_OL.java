package problems;

import java.util.Arrays;

public class _283_Move_Zeros_attempt_OL {

	public static void main(String[] args) {
		int[] nums = {9,1,0,0,0,3,12};
		System.out.println(Arrays.toString(nums));
		moveZeros(nums);
		System.out.println(Arrays.toString(nums));
	}

	// 0,1,0,3,12
	// 1,0,0,3,12
	// 1,3,0,0,12
	// 1,3,12,0,0
	private static void moveZeros(int[] nums) {
		
		int id = 0;
        
		for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
            	nums[id++] = nums[i];
            }
        }
        
        while (id < nums.length) {
        	nums[id++] = 0;
        }
    }

}
