package problems;

import java.util.Arrays;

public class _283_Move_Zeros_attempt_1_self {

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
		int val = 0;
		int i = 0;
		boolean zeroFound = false;
		for (i = 0; i < size; i++) {
			int zero = 0;
			val =  i;
			for(; zero < size; zero++) {
				if(nums[zero] == 0) {
					zeroFound = true;
					break;
				}
			}
			for(; val < size; val++) {
				if(nums[val] != 0 && zeroFound && val > zero) {
					swap(nums, zero, val);
					break;
				}
			}
		}
	}

	private static void swap(int[] nums, int zero, int val) {
		int temp = nums[val];
		nums[val] = nums[zero];
		nums[zero] = temp;
	}

}
