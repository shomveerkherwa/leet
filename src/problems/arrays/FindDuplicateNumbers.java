package problems.arrays;

public class FindDuplicateNumbers {

	public static void main(String[] args) {
		int[] nums = {3,1,3,4,2};
		System.out.println(findDuplicate_bs(nums));
	}

	public static int findDuplicate(int[] nums) {
		int size = nums.length;
		int totalSum = (size * (size+1))/2;
		int actualSum = 0;
		for(int n : nums) {
			actualSum = actualSum+n;
		}
		return totalSum-actualSum;
	}
	
	public static int findDuplicate_bs(int[] nums) {
        int len = nums.length;
        int low = 1;
        int high = len - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int cnt = 0;
            for (int i = 0; i < len; i++) {
                if (nums[i] <= mid) {
                    cnt++;
                }
            }

            if (cnt <= mid) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return low;
    }
	

}
