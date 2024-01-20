package problems.strings;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindUniqueBinaryString {

	public static void main(String[] args) {
		String[] nums = {"01","10"};
		System.out.println(findDifferentBinaryString(nums));
	}
	
	public static String findDifferentBinaryString(String[] nums) {
		Set<String> set = new HashSet<String>();
		for(String i : nums)
				set.add(i);
		
		return getCombination("", set, nums[0].length(), null);
		
    }
	
	private static String getCombination(String current, Set<String> set, int size, String val) {
		while(current.length() < size) {
			if(current.length() == size && !set.contains(current))
				return current;
			
			val = getCombination(current+0, set, size, val);
			if(val == null)
			val = getCombination(current+1, set, size, val);
		}
		return val;
	}
}
