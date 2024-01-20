package revision.hashmap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {7,2,11,15}; int target = 9;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}
	
	public static int[] twoSum(int[] numbers, int target) {
		int result[] = new int[2];
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<numbers.length;i++) {
			int diffNeeded = target-numbers[i];
			if(map.containsKey(diffNeeded) && map.get(diffNeeded) != i) {
				result[0]=i;
				result[1]= map.get(diffNeeded);
				return result;
			} else {
				map.put(numbers[i], i);
			}
		}
		return result;
	}
	
	// this works only if the array is sorted.
	public static int[] twoSumPointers(int[] numbers, int target) {
		int result[] = new int[2];
		int low = 0;
		int high = numbers.length-1;
		while(low < high) {
			int sum = numbers[low]+numbers[high];
			if(sum<target) {
				low++;
			}else if(sum > target) {
				high--;
			}else {
				result[0]=low;
				result[1]=high;
				break;
			}
		}
		return result;
	}

}
