package problems;

public class _35_Search_Insert_Positon_Looping {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6, 9, 12, 14 };
		int target = 2;
		int index = soultion(nums, target);
		System.out.println("insert " + target + " at index " + index);
	}

	
	private static int soultion(int[] nums, int target) {
		int unsuccessful = -1;
		// check for emptyness of the array
		if (nums == null || nums.length == 0) {
			return unsuccessful;
		}
		return searchInsertPosition(nums, target);
	}

	
	
	public static int searchInsertPosition(int[] nums, int target) {
		if (nums == null)
			return -1;
		int lo = 0, hi = nums.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (nums[mid] == target)
				return mid;
			else if (nums[mid] < target)
				lo = mid + 1;
			else
				hi = mid - 1;
		}
		return lo;
	}

}
