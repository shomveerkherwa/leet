package problems;

import java.util.Arrays;

public class JumpGame {

	public static void main(String[] args) {
		//int[] nums = {2,3,1,1,4};
		int[] nums = {3,2,1,0,4};
		System.out.println(Arrays.toString(nums));
		System.out.println(canJumpAgain(nums));
	}
	
	public static boolean canJumpAgain(int[] nums) {
		int reachable = 0;
		int size = nums.length;
		for(int i=0; i< nums.length; i++) {
			if(i > reachable)
				return false;
			if(reachable >= size-1)
				return true;
			reachable = Math.max(reachable, i+nums[i]);
		}
		return false;
	}
	
	public static boolean canJump(int[] nums) {
		if(nums.length < 2) {
			return true;
		}
		
		// start from end
		for(int i = nums.length-2; i >= 0; i--) {
			// if a 0 is encountered from end to beginning, can it be jumped. If there are only non-zero number, continue
			if(nums[i] == 0) {
				int jumpNeeded = 1;
				while(jumpNeeded > nums[i]) {
					//because with every step backward , jump increases
					jumpNeeded++;
					i--;
					
					// if we reach end
					if(i < 0) {
						return false;
					}
				}
			}
		}
		
		return true; 
    }

}
