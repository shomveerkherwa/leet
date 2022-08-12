package problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfTwoArray_2 {

	public static void main(String[] args) {
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		int[] intersection = intersect(nums1, nums2);
		System.out.println(Arrays.toString(intersection));
	}
	
	public static int[] intersect(int[] nums1, int[] nums2) {
		List<Integer> intersect = new ArrayList<Integer>();
		Map<Integer, Integer> occur1 = new HashMap<Integer, Integer>();
		for(int i : nums1) {
			occur1.put(i, occur1.getOrDefault(i, 0)+1);
		}
		
		for(int i: nums2) {
			if(occur1.containsKey(i)) {
				intersect.add(i);
				if(occur1.get(i) == 1) {
					occur1.remove(i);
				}else {
					occur1.put(i, occur1.get(i)-1);
				}
			}
		}
		int[] intArray = new int[intersect.size()];
		for(int i=0; i<intersect.size();i++) {
			intArray[i]= intersect.get(i);
		}
		return intArray;
	}
}
