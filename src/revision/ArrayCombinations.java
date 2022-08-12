package revision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayCombinations {

	public static void main(String[] args) {
		int inp[] = { 1,2,3 };
		List<List<Integer>> permutations = permute(inp);
		for(List<Integer> i : permutations) {
			System.out.println(Arrays.toString(i.toArray()));
		}
	}

	public static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> permutations = new ArrayList<>();
		generate(nums, permutations, 0 , nums.length-1);
		return permutations;
	}

	private static void generate(int[] nums, List<List<Integer>> permutations, int left, int right) {
		if(left >= right) {
			permutations.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
			return;
		}
		else {
			for(int i=left; i<= right; i++) {
				nums = swap(nums, left, i);
				generate(nums, permutations, left+1, right);
				nums = swap(nums, left, i);
			}
		}
		
	}
	
	private static int[] swap(int[] nums, int left, int i) {
		int t = nums[left];
		nums[left] = nums[i];
		nums[i] = t;
		return nums;
	}
}
