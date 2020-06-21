package problems;

import java.util.HashSet;
import java.util.Set;

public class _217_Contains_Duplicate_Num_HashSet {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1,4};
		boolean result1 = containsDuplicate(nums);
		System.out.println(result1);
		
		int[] nums2 = {1,2,3,4};
		boolean result2 = containsDuplicate(nums2);
		System.out.println(result2);
	}

	public static boolean containsDuplicate(int[] nums) {
		Set<Integer> uniqueSet = new HashSet<Integer>();
		for(int i : nums) {
			if(uniqueSet.contains(i))
				return true;
			uniqueSet.add(i);
		}
		return false;
	}
}
