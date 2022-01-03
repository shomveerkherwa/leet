package problems;

import utility.ArrayReader;

public class _702_Search_Sorted_Array_Of_Unknown_Size {
	public static void main(String[] args) {
		int[] nums = {1,2,5,7,9,12,14};
		int target = 9;
		int index = soultion(nums, target);
		System.out.println(index);
	}

	private static int soultion(int[] nums, int target) {
		int unsuccessful = -1;
		// check for emptyness of the array
		if(nums == null) {
			return unsuccessful;
		}
		ArrayReader reader = new ArrayReader(nums);
		return binarySearch(nums, target, reader, 0, Integer.MAX_VALUE);
	}

	// {1,2,5,7,9,12,14,.......}
	// since we do not know the end, we start with a max value, and with every iteration the end gets smaller
	private static int binarySearch(int[] nums, int target,ArrayReader reader, int start, int end) {
		if (start <= end) {
			int mid = (start + end) / 2;
			int midVal = reader.get(mid);
			if (midVal == target) {
				return mid;
			}
			// check if the target is less than the mid element
			if (target > midVal) {
				return binarySearch(nums, target, reader, mid + 1, end);
			}
			if (target < midVal) {
				return binarySearch(nums, target, reader, start, mid - 1);
			}
		}
		return -1;
	
	}
}
