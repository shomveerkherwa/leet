package problems.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinations {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		List<List<Integer>> result = subsetsIterative(nums);
		for(List<Integer> curr : result) {
			System.out.println(Arrays.toString(curr.toArray()));
		}
		result = subsetsBacktrack(nums);
		for(List<Integer> curr : result) {
			System.out.println(Arrays.toString(curr.toArray()));
		}
	}

	public static List<List<Integer>> subsetsIterative(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		result.add(new ArrayList<>());
		
		for(int n : nums) {
			int size = result.size();
			for(int i=0; i< size; i++) {
				List<Integer> current = new ArrayList<>(result.get(i));
				current.add(n);
				result.add(current);
			}
		}
		return result;
	}
	
	public static List<List<Integer>> subsetsBacktrack(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		backTrack(0, nums, new ArrayList<>(), result);
		return result;
	}

	private static void backTrack(int index, int[] nums, ArrayList current, List<List<Integer>> result) {
		result.add(new ArrayList<>(current));
		
		for(int i=index; i<nums.length; i++) {
			current.add(nums[i]);
			backTrack(i+1, nums, current, result);
			current.remove(current.size()-1);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
