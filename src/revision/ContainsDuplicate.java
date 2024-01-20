package revision;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[]nums = {1,1,2,3,4,1}; int k = 3;
		System.out.println(Arrays.toString(nums) +" in interval space of "+k+" has duplicates? "+containsNearbyDuplicate(nums, k));

	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int left=0; int right=0;
        Set<Integer> frequency = new HashSet<Integer>();
        for(;right < nums.length;right++ ) {
        	if(frequency.contains(nums[right])) {
        		return true;
        	}
        	frequency.add(nums[right]);
        	if(right-left == k) {
        		frequency.remove(nums[left]);
        		left++;
        	}
        }
        return false;
    }
}
