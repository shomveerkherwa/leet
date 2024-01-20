package twenty23.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate2 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,4,8,9};
		int distance = 3;
		System.out.println(Arrays.toString(nums)+ " "+distance);
		System.out.println(containsNearbyDuplicate(nums, distance));
	}

	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<nums.length;i++) {
			if(i > k) {
				set.remove(nums[i-k-1]);
			}
			if(!set.add(nums[i])) {
				return true;
			}
			System.out.println(set.size());
			
		}
		
		return false;
        
    }
}
