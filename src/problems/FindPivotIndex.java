package problems;

import java.util.Arrays;

public class FindPivotIndex {

	public static void main(String[] args) {
		//int[] nums = {1,7,3,6,5,6};
		//int[] nums = {1,2,3};
		//int[] nums = {2,1,-1};
		//int[] nums = {-1,-1,-1,-1,-1,-1};
		int[] nums = {-1,-1,-1,-1,-1,0};
		System.out.println(Arrays.toString(nums));
		int index = pivotIndex(nums);
		
		System.out.println(Arrays.toString(nums) +" has a pivot at index "+index);
	}

	
	public static int pivotIndex(int[] nums) {
		int index = -1;
		int size = nums.length;
		int[] leftSum = new int[size];
		int[] rightSum = new int[size];
		
		leftSum[0] = nums[0];
		rightSum[size-1] = nums[size-1];
		
		for(int i=1; i<size; i++) {
			leftSum[i] = nums[i] + leftSum[i-1];
			rightSum[size-1-i] = nums[size-1-i] + rightSum[size-i];
		}
		
		System.out.println(Arrays.toString(leftSum));
		System.out.println(Arrays.toString(rightSum));
		
		for(int i=0; i<size; i++) {
			if(leftSum[i] == rightSum[i])
				return i;
		}
		return index;
	}
}
