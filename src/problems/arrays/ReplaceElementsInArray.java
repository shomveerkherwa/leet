package problems.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReplaceElementsInArray {

	public static void main(String[] args) {
		int[] nums = {1,2};
		int[][] operations = {{1,3},{2,1},{3,2}};
		System.out.println(Arrays.toString(nums));
		int[] result = arrayChange(nums, operations);
		System.out.println(Arrays.toString(result));
	}
	
	public static int[] arrayChange(int[] nums, int[][] operations) {
        Map<Integer,Integer> numToIndex = new HashMap<>();
		
        for(int i=0; i<nums.length; i++) {
        	numToIndex.put(nums[i], i);
        }
        
        for(int[] ops : operations) {
        	int key = ops[0];
        	int val = ops[1];
        	
        	int index = numToIndex.get(key);
        	nums[index] = val;
        	numToIndex.remove(key);
        	numToIndex.put(val, index);
		}
        
        return nums;
    }
}
