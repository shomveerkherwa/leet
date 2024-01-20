package problems;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {

	public static void main(String[] args) {
		int[] nums = {2,2};
		int target = 2;
		System.out.println(Arrays.toString(searchRange(nums,target)));
	}

	public static int[] searchRange(int[] nums, int target) {
		int first = binarySearchContinue(nums,target);
		if(first == -1)
			return new int[] {-1,-1};
		int second = binarySearch(nums,target);
		int[] result = new int[]{first, second};
		return result;
    }

	private static int binarySearch(int[] nums, int target) {
		int start = 0;
		int end = nums.length-1;
		int idx = -1;
		while(start <= end) {
			int mid = start + (end - start)/2;
			// set the correct value of mid
			if(nums[mid] == target)
				idx = mid;
			if(nums[mid] > target)
				end = mid-1;
			else
				start = mid+1;
		}
		return idx;
	}
	
	private static int binarySearchContinue(int[] nums, int target) {
		int start = 0;
		int end = nums.length-1;
		int idx = -1;
		while(start <= end) {
			int mid = start + (end - start)/2;
			// set the correct value of mid
			if(nums[mid] == target)
				idx = mid;
			// we continue looping even if mid = target to push to the most left index.
			if(nums[mid] >= target)
				end = mid-1;
			else
				start = mid+1;
		}
		return idx;
	}
}
