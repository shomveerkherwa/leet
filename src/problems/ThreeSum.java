package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		List<List<Integer>> batch = threeSum(nums);
		for(List<Integer> threes : batch) {
			System.out.println(Arrays.toString(threes.toArray()));
		}
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> batch = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int toFind = -nums[i];
			int low = i + 1, high = nums.length - 1;
			while (low < high) {
				int sum = nums[low] + nums[high];
				if (sum == toFind) {
					List<Integer> threes = new ArrayList<>();
					threes.add(nums[i]);
					threes.add(nums[low]);
					threes.add(nums[high]);
					batch.add(threes);
					low++;
					high--;
					while (low < high && nums[low] == nums[low - 1])
						low++;
					// tp omit duplictaes with 3rd element in triplet
					while (low < high && nums[high] == nums[high + 1])
						high--;
				}
				if (sum < toFind)
					low++;
				else
					high--;
			}
		}
		return batch;
	}
}
