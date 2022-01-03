package problems;

/*
 * Given a sorted array of distinct integers and a target value, return the
 * index if the target is found. If not, return the index where it would be if
 * it were inserted in order.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class _35_Search_Insert_Position {

	public static void main(String[] args) {
		int[] nums = { 1, 3, 5, 6, 9, 12, 14 };
		int target = 2;
		int index = soultion(nums, target);
		System.out.println("insert "+target+" at index "+index);
	}

	private static int soultion(int[] nums, int target) {
		int unsuccessful = -1;
		// check for emptyness of the array
		if(nums == null || nums.length == 0) {
			return unsuccessful;
		}
		return searchInsertPosition(nums, target, 0, nums.length-1);
	}

	/*
	 * This is basically Binary seach where you tell the index of target if matches,
	 * or you send the low value. Which is its ideal place if it were to be
	 * inserted.
	 */
	private static int searchInsertPosition(int[] nums, int target, int start, int end) {
		
		if(start <= end) {
			
			int mid = (start + end) /2;
			int midVal = nums[mid];
			
			if(target == midVal) {
				return mid;
			}else if(target < midVal ) { // look at left hand side of array
				return searchInsertPosition(nums, target, start, mid-1);
			}else { // look at right hand side of the array
				return searchInsertPosition(nums, target, mid+1, end);
			}
			
		}
		
		return start;
	}
}
