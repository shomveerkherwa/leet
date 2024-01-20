package revision.array;

import java.util.Arrays;

public class PartitionArrayBasedOnPivot {

	public static void main(String[] args) {
		int[] nums = {9,12,5,10,14,3,10}; int pivot = 10;
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(pivotArray(nums, pivot)));
	}
	
	public static int[] pivotArray(int[] nums, int pivot) {
		int[] ans = new int[nums.length];
		int i=0;
		for(int n : nums) {
			if(n < pivot) 
				ans[i++]=n;
		}
		for(int n : nums) {
			if(n == pivot) 
				ans[i++]=n;
		}
		for(int n : nums) {
			if(n > pivot) 
				ans[i++]=n;
		}
		return ans;
    }

}
