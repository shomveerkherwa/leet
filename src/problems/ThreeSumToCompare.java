package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumToCompare {

	public static void main(String[] args) {
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> batch = threeSum(nums);
		for (List<Integer> threes : batch) {
			System.out.println(Arrays.toString(threes.toArray()));
		}
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int toFind = -nums[i];
			int low = i + 1, high = nums.length - 1;
			while (low < high) {
				int sum = nums[low] + nums[high];
				if (sum == toFind) {
					List<Integer> curr = new ArrayList<>();
					curr.add(nums[i]);
					curr.add(nums[low]);
					curr.add(nums[high]);
					ans.add(curr);
					low++;
					high--;
					while (low < high && nums[low] == nums[low - 1])
						low++;
					while (low < high && nums[high] == nums[high + 1])
						high--;
				} else if (sum < toFind) {
					low++;
				} else {
					high--;
				}
			}
		}
		return ans;
	}
}
