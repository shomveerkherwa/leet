package problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicates {

	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer> dups = findDuplicates(nums);
		dups.stream().forEach(i -> System.out.println(i));
	}

	public static List<Integer> findDuplicates(int[] nums) {
        int size = nums.length;
        List<Integer> result = new ArrayList<Integer>();
		for(int i=0; i<size;i++) {
			int index = Math.abs(nums[i])-1;
			if(nums[index] < 0) {
				result.add(index+1);
			}
			else
				nums[index] = nums[index] * -1;
		}
		
		return result;
    }
	
	public static List<Integer> findDuplicates2(int[] nums) {
        int size = nums.length;
		Arrays.sort(nums);
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i=1; i<size;i++) {
			if(nums[i] == nums[i-1] )
				result.add(nums[i]);
		}
		
		return result;
    }
}
