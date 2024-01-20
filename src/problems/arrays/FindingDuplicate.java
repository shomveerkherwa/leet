package problems.arrays;

import java.util.Arrays;

public class FindingDuplicate {

	public static void main(String[] args) {
		int[] nums = {2,2,2};
		System.out.println(Arrays.toString(nums) +" --> "+findDuplicate(nums));
	}

	public static int findDuplicate(int[] nums) {
        for(int i=0; i< nums.length; i++) {
        	int index = Math.abs(nums[i]) - 1;
        	if(nums[index] < 0)
        		return index+1;
        	else
        		nums[index] = nums[index] * -1;
		}
        
        for(int i=0; i<nums.length; i++)
        	if(nums[i] > 0)
        		return i+1;
        
        return -1;
    }
}
