package problems;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		// int[]  nums = {3,2,2,3}; int val = 3;
		// int[] nums = {0,1,2,2,3,0,4,2}; int val = 2;
		// int[]  nums = {1}; int val = 1;
		 int[]  nums = {1,1,2,1}; int val = 1;
		//int[]  nums = {}; int val = 1;
		System.out.println("input "+Arrays.toString(nums));
		int k = removeElementByShiftingCorrectValuesOnLeft(nums, val);
		System.out.println("output "+Arrays.toString(nums));
		for(int i=0; i<k; i++) {
			System.out.print(nums[i]+"\t");
		}
	}
	
	public static int removeElement(int[] nums, int val) {
		
		int left = 0;
		int right = nums.length-1;
		
		if(nums.length == 0) {
			return nums.length;
		}
		
		// move from left to a place where you dont have the value
		while(right >= 0 && nums[right] == val) {
			right--;
		}
		
		if(right < 0) {
			return right;
		}
		
		while(left <= right) {
			if(nums[left] == val) {
				int temp = nums[right];
				nums[right] = nums[left];
				nums[left] = temp;
				left++;
				right--;
				
				// check again if we dont find same number
				while(right >= 0 && nums[right] == val) {
					right--;
				}
			} else {
				left++;
			}
		}
		
		return left;
	}
	
	public static int removeElementByShiftingCorrectValuesOnLeft(int[] nums, int val) {
		int left = 0;
		
		for(int right = 0; right < nums.length; right++) {
			if(nums[right] != val) {
				nums[left]= nums[right];
				left++;
			}
		}
		
		return left;
	}

}
