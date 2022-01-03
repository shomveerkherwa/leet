package algos;

public class _704_Binary_Search_Recursion {
	public static void main(String[] args) {
		int[] nums = {1,2,5,7,9,12,14};
		int target = 15;
		int index = soultion(nums, target);
		System.out.println(index);
	}

	private static int soultion(int[] nums, int target) {
		int unsuccessful = -1;
		// check for emptyness of the array
		if(nums == null || nums.length == 0) {
			return unsuccessful;
		}
		return binarySearch(nums, target, 0, nums.length-1);
	}

	// {1,2,5,7,9,12,14}
	private static int binarySearch(int[] nums, int target, int start, int end) {
		if(start <= end) {
			int mid = (start + end)/2;
			if(nums[mid] == target) {
				return mid;
			}
			// check if the target is less than the mid element
			if(target > nums[mid]) {
				return binarySearch(nums, target, mid+1, end);
			}
			if(target < nums[mid]) {
				return binarySearch(nums, target, start, mid-1);
			}
		}
		return -1;
	}
}
