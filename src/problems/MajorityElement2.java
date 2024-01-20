package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {

	public static void main(String[] args) {
		//int[] nums = {3,2,3};
		int[] nums = {0,0,0};
		List<Integer> result = majorityElementByHashMap(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(result.toArray()));
	}

	// this takes marginally less memory but very long time
	public static List<Integer> majorityElementByHashMap(int[] nums) {
        List<Integer> result = new ArrayList<Integer>(2);
        Map<Integer,Integer> frequencyCount = new HashMap<>();
        int magicNumber = nums.length/3;
        for(int n: nums) {
        	frequencyCount.put(n, frequencyCount.getOrDefault(n, 0)+1);
        }
        
        for(int n: nums) {
        	if(frequencyCount.get(n) !=null &&  frequencyCount.get(n) > magicNumber) {
        		frequencyCount.remove(n);
        		result.add(n);
        	}
        }
        return result;
	}
	
	
	// below algorithm takes more memory compared to hashmap solution but it takes less time
	public static List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<Integer>(2);
        
        if(nums.length < 0) {
        	return result;
        }
        
        int candidate1, candidate2, count1, count2;
        candidate1 = candidate2 = Integer.MAX_VALUE; 
        count1 = count2 = 0;
        
        for(int num : nums) {
        	if(candidate1 == num) {
        		count1++;
        	}
        	else if(candidate2 == num) {
        		count2++;
        	}
        	else if (count1 == 0) {
        		candidate1 = num;
        		count1++;
        	}
        	else if( count2 == 0) {
        		candidate2 = num;
        		count2++;
        	} else {
        		count1--;
        		count2--;
        	}
        }
        
        // check if the candidates have the majority or they happen to be the lucky candidates who were counted at last.
        
        // reset to count again
        count1 = count2 = 0;
        for(int num : nums) {
        	if(num == candidate1)
        		count1++;
        	if(num == candidate2)
        		count2++;
        }
        
        if(count1 > nums.length/3)
        	result.add(candidate1);
        if(count2 > nums.length/3)
        	result.add(candidate2);
        return result;
    }
}
